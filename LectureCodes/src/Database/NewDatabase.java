
package Database;
import Lecture26.Student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class NewDatabase {
    Connection conn=null;
    PreparedStatement pstat=null;
    ResultSet rs;
    String str_sql;
    boolean result;
    String str_driver="com.mysql.jdbc.Driver";
    String str_dbname="db_training";
    String str_url="jdbc:mysql://localhost:3306/";
    String str_user="root";
    String str_pass="";
    private void connect_db(){
        try{
            Class.forName(str_driver);
            conn=DriverManager.getConnection(str_url+str_dbname,str_user,str_pass);
            
            
        }catch(Exception ex){
            System.out.println("Error:"+ex.getMessage());
        }
    }
    private void close_db(){
        try{
            conn.close();
            
        }catch(Exception ex){
            System.out.println("Error:"+ex.getMessage());
        }
    }
    public boolean insertRecord(Student student ){
        result=false;
        String str_sql="insert into tbl_student(id,full_name,contact_address) values(?,?,?)";
        
        try{
            connect_db();
            pstat=conn.prepareStatement(str_sql);
            pstat.setInt(1,student.getId());
            pstat.setString(2, student.getFull_name());
            pstat.setString(3, student.getContact_address());
            pstat.executeUpdate();
            pstat.close();
            close_db();
            result=true;
            
        }catch(Exception ex){
            result=false;
            System.out.println("Error:"+ex.getMessage());
        }
      return result;  
    }
    public Student searchRecord(Student student){
        try{
            
            
            connect_db();
            String str_sql="select * from tbl_student where id=?";
            pstat=conn.prepareStatement(str_sql);
            pstat.setInt(1,student.getId());
            rs=pstat.executeQuery();
            student= new Student();
            while(rs.next()){
                student.setId(rs.getInt(1));
                student.setFull_name(rs.getString(2));
                student.setContact_address(rs.getString(3));
            }
            rs.close();
            close_db();
                    
            
            
        }catch(Exception ex){
            System.out.println("Error:"+ex.getMessage());
        }
        return student;   
    }
    
}
