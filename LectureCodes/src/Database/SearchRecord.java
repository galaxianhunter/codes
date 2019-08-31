
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SearchRecord {
    public static void main(String[] args) {
        //search is always based on primary keys or unique fields like id or mobile numbre or email etc
        //individual search
        //steps
        
        //connect
        //SqL statements
        //resultset
        Connection conn;
        Statement stat;
        String str_sql;
        ResultSet rs;
        boolean result=false;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_training","root","");
            str_sql="SELECT * FROM tbl_student where id=2";
            stat=conn.createStatement();
            rs=stat.executeQuery(str_sql);
            while(rs.next()){
                result=true;
                System.out.println("ID:"+rs.getInt(1));
                System.out.println("Name"+rs.getString(2));
                System.out.println("Address:"+rs.getString(3));
                
            }
            if(result){
                System.out.println("Recordfound and display successfully");
            }else{
                System.out.println("Record not found");
            }
            
        }catch(Exception ex){
            System.out.println("error"+ex);
        }
    }
    
}
