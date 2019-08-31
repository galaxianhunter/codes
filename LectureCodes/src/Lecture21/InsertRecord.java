
package Lecture21;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecord {
    
    
    
        //step 1-
        //Mysql engine install
        //Workbench IDE
    
        // Step 2
        //XAMPPServer
        // apache 
        // mysql
    
    //Managing Database
    
        // create database
        //Drop database
        //Export Database(Select database->Export) 
        //import database
    
    
    //Managing Tables
        //Select database
        //create table 
    // tbl_student 
        //id:int(3)
        //full_name
    
    //Data Manupulation
    
    // INSERT INTO tbl_student(id,full_name,contact_address) VALUES (1,'raj','lta')
    //INSERT INTO tbi_student VALUES(2,'sandip','Parasi')
    //SELECT id,full_name,contact_address FROM tbl_sudent
    //SELECT * FROM tbl_sudent
    
    // no need to put semi colon for single line command in SQL
    
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver"); //load Driver
            Connection conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            //Steps to insert records
            
            String str_sql="INSERT INTO tbl_student(id,full_name,contact_address) VALUES(3,'Sandip','parasi')";
            
            System.out.println("Database Connected Successfully");
            Statement stat=conn.createStatement();
            stat.executeUpdate(str_sql);
            
            //Change table name by using sattement RENAME TABLE tbi_sudent TO tbl_student
            stat.close();
            conn.close();
            
            
            
            
            
            
            
        }catch(Exception ex){
            System.out.println("Error"+ ex);
        }
    }
    
    
    
    
    
    
}
