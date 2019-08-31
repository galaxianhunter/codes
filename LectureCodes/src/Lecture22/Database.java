
package Lecture22;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {
    public boolean insertRecord(int id, String full_name,String contact_address){
        boolean res;
        Connection con;
        Statement stat;
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db_training","root","");
            
            //String str= "INSERT INTO tbl_student(id,full_name,contact_address)Values(4,'kiran','ktm')";
            String str= "INSERT INTO tbl_student(id,full_name,contact_address)Values("+id+",'"+full_name+"','"+contact_address+"')";
            stat=con.createStatement();
            stat.executeUpdate(str);
            stat.close();
            con.close();
            res=true;
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error:"+ex);
            res=false;
            
        }
        
        
        return res;
    }
    public void getRecords(){
        Connection con2;
        Statement stat2;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_training","root","");
            String str="SELECT * FROM tbl_student";
            stat2=con2.createStatement();
            ResultSet rs=stat2.executeQuery(str);
            System.out.println("ID\t\t FULL NAME \t\t\t CONTACT_ADRESS");
            while(rs.next()==true){
                //System.out.print(rs.getInt(1)+rs.getString(2)+rs.getString(3));
                System.out.print(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t\t"+rs.getString(3));
                System.out.print("");
               
            }
            stat2.close();
            con2.close();
            
            
            
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("Error"+ex);
            
        }
        
        
        
        
        
    }
    public boolean updateRecord(int id,String full_name, String contact_address){
        Connection conn;
        Statement stat;
        String str_sql;
        boolean result;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/db_training","root","");
            //str_sql="update tbl_student set full_name='new name',contact_address='new address'where id=1";
            str_sql="update tbl_student set full_name='"+full_name+"',contact_address='"+contact_address+"'where id="+id;
            stat=conn.createStatement();
            stat.executeUpdate(str_sql);
            stat.close();
            conn.close();
            result=true;
            
            
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("Error:"+ex.getMessage());
            result=false;
            
        }
        
        
        
        return result;
    }
    public boolean deleterecord(int id){
        Connection conn;
        Statement stat;
        String str_sql;
        boolean result=false;
         try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_training","root","");
            stat=conn.createStatement();
            str_sql="DELETE FROM tbl_student where id="+id;
            stat.executeUpdate(str_sql);
            stat.close();
            conn.close();
            result=true;
            System.out.println("Delete record successfully");
            
            
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("Error:"+ex.getMessage());
            result= false;
            
        }
         return result;
        
    }
    public boolean searchRecord(int id){
        Connection conn;
        Statement stat;
        String str_sql;
        ResultSet rs;
        boolean result=false;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_training","root","");
            str_sql="SELECT * FROM tbl_student where id="+id;
            stat=conn.createStatement();
            rs=stat.executeQuery(str_sql);
            while(rs.next()){
                result=true;
                System.out.println("ID:"+rs.getInt(1));
                System.out.println("Name"+rs.getString(2));
                System.out.println("Address:"+rs.getString(3));
                
            }
           
            
        }catch(Exception ex){
            System.out.println("error"+ex);
            result=false;
        }
        return result;
    }
    
}
