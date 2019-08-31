
package Lecture22;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class selectRecord {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");//load driver
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            String str_sql="SELECT * FROM tbl_student";
            Statement stat=conn.createStatement();
            ResultSet rs =stat.executeQuery(str_sql);
            
            while(rs.next()== true){//if rs have record/s found
                System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3));
                System.out.println("");
                conn.close();
                System.out.println("Connected to database Successfully");
            }
            
        }catch(Exception ex){
            System.out.println("Error:"+ex);
        }
        
    }
    
}
