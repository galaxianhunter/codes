
package Lecture23;
import java.util.Scanner;
import Lecture22.Database;
public class Test2 {
    public static void main(String[] args) {
        try{
            int choice=0;
            do{
                System.out.println("Main Menu");
                System.out.println("1. Display All");
                System.out.println("2. Insert Record");
                System.out.println("3.Update Record");
                System.out.println("0.exit");
                System.out.println("----------------");
                System.out.println("Enter your choice");
                choice= new Scanner (System.in).nextInt();
                System.out.println("--------------");
                System.out.println("Your Choice"+choice);
                switch(choice){
                    case 1:
                        Database db=new Database();
                        db.getRecords();
                        break;
                    
                    case 0:
                        System.exit(0);
                        
                    default:
                        System.out.println("Others");
                        
                
            }
                        
                
            }while(choice!=0);
            
        }catch(Exception ex){
            System.out.println("Error:"+ex.getMessage());
        }
    }
    
}
