
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class UpdateRecord {
    //update
    /* 
    -Connect
    -SQL Statement for update
    -Create Sttement
    -Execute
    -Close Statement
    -close Connection
    */
    
    
    public static void main(String[] args) {
        Connection conn;
        Statement stat;
        String str_sql;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/db_training","root","");
            str_sql="update tbl_student set full_name='new name',contact_address='new address'where id=1";
            stat=conn.createStatement();
            stat.executeUpdate(str_sql);
            stat.close();
            conn.close();
            
            
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("Error:"+ex.getMessage());
        }
    }
}
