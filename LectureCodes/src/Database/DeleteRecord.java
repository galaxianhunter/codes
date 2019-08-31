
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class DeleteRecord {
    public static void main(String[] args) {
        Connection conn;
        Statement stat;
        String str_sql;
        //boolean result=false;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_training","root","");
            stat=conn.createStatement();
            str_sql="DELETE FROM tbl_student where id=1";
            stat.executeUpdate(str_sql);
            stat.close();
            conn.close();
            System.out.println("Delete record successfully");
            
            
        }catch(Exception ex){
            System.out.println("Error:"+ex.getMessage());
            
        }
    }
    
}
