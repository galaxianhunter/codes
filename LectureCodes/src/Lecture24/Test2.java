
package Lecture24;
import java.util.Scanner;
import Lecture22.Database;
import Basic_IO.BasicIO;
public class Test2 {
    public static void main(String[] args) {
        try{
            int choice=0;
            do{
                System.out.println("Main Menu");
                System.out.println("1. Display All");
                System.out.println("2. Insert Record");
                System.out.println("3.Update Record");
                System.out.println("4.Delete Record");
                System.out.println("5.Search Record");
                System.out.println("0.exit");
                System.out.println("----------------");
                System.out.println("Enter your choice");
                choice= new Scanner (System.in).nextInt();
                System.out.println("--------------");
                System.out.println("Your Choice"+choice);
                Database db=null;
                switch(choice){
                    case 1://display
                         db=new Database();
                        db.getRecords();
                        break;
                    case 2://insert
                        db=new Database();
                        int id=BasicIO.readint("Enter ID");
                        String full_name=BasicIO.readString("Enter Full name");
                        String contact_address=BasicIO.readString("Enter contact address");
                        
                       if(db.insertRecord(id,full_name,contact_address)) {
                        System.out.println("Record inserted successfully");
                       }
                        
                        else{
                           System.out.println("Error to record: ");
                        }
                        break;
                        
                    case 3://update
                        db=new Database();
                        id=BasicIO.readint("Enter ID");
                        full_name=BasicIO.readString("Enter Full name");
                        contact_address=BasicIO.readString("Enter contact address");
                        
                        if(db.updateRecord(id, full_name, contact_address)){
                            System.out.println("");
                        }
                        else{
                            System.out.println("");
                        }
                 
                        break;
                        
                    case 4:// delete
                        db=new Database();
                        id=BasicIO.readint("Enter ID");
                        if(db.deleterecord(id)){
                        System.out.println("Data deleted"); }
                        break;
                        
                    case 5:
                        db=new Database();
                        id=BasicIO.readint("Enter ID");
                        if(db.searchRecord(id)){
                            System.out.println("Search and Display successfully");
                        }
                        else{
                            System.out.println("Record not found");
                        }
                        break;
                        
                        
                    case 0:
                        System.exit(0);
                        
                        
                        
                    default:
                        System.out.println("Enter Valid Number: ");
                        
                
            }
                        
                
            }while(choice!=0);
            
        }catch(Exception ex){
            System.out.println("Error:"+ex.getMessage());
        }
    }
    
}
