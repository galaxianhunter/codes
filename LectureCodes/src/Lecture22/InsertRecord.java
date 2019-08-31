
package Lecture22;

import java.sql.Connection;
import java.sql.DriverManager;


public class InsertRecord {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql:/localhsot:3306/db_training","root","");
            conn.close();
            
        }catch(Exception ex){
            System.out.println("error:"+ex);
            
        }
    }
    
}
