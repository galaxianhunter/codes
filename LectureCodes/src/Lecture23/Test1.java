
package Lecture23;

import Lecture22.Database;
import java.util.Scanner;

public class Test1 {
    
    public static void main(String[] args) {
        Database db=new Database();
        int id;
        String full_name;
        String contact_address;
        
        db.getRecords();
        
        //input 
        System.out.println("Enter id");
        id=new Scanner(System.in).nextInt();
        System.out.println("Enter full_name");
        full_name=new Scanner(System.in).nextLine();
        System.out.println("Enter contact_address");
        contact_address=new Scanner(System.in).nextLine();
        
        //boolean insert_result=db.insertRecord(1, "Keshor", "LAT");
        boolean insert_result=db.insertRecord(id, full_name, contact_address);
        
        //Delete from tbl_student is a sql code
        if (insert_result=true){
            System.out.println("Record Inserted");
            
        }
        else{
            System.out.println("Error:to insert record");
        }
    }
    
}
