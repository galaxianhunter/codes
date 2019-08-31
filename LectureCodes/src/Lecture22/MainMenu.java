
package Lecture22;
import java.util.Scanner;

public class MainMenu {
    static int num;
    
    public static void display(){
        System.out.println("Enter 1 to ADD");
        System.out.println("Enter 2 to Display");
        System.out.println("Enter 3 to exit");
                
        Scanner sc =new Scanner(System.in);
        num =sc.nextInt();
        
                
    }
    public static void main(String[] args) {
        
        display();
        if(num==1){
            do{
            Database db=new Database();
            System.out.println("Enter id:");
            int id=new Scanner(System.in).nextInt();
            System.out.println("Enter Full name:");
            String full_name=new Scanner(System.in).nextLine();
            System.out.println("Enter contact address:");
            String contact_address=new Scanner(System.in).nextLine();
            db.insertRecord(id, full_name, contact_address);
            System.out.println("information has been Added");
            
            display();
            }while(num!=3);
          
           
        }
        if(num==2){
            Database db=new Database();
           
        }
        
    }
    
}
