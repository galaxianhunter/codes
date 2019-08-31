
package Lecture26;
import Basic_IO.BasicIO;
import Database.NewDatabase;
public class Test {
    
    public static Student main(String[] args) {
        
        Student student1=new Student();
        NewDatabase db = new NewDatabase();
        boolean result= false;
        /*
        student1.setId(BasicIO.readint("enter student id"));
        student1.setFull_name(BasicIO.readString("Enter Fullname"));
        student1.setContact_address(BasicIO.readString("Enter the address"));
        result=db.insertRecord(student1);
        if (result){
            System.out.println("Record Save Successfully");
        }
        else{
            System.out.println("Error occured and data not saved");
        }*/
        
        student1.setId(BasicIO.readint("Enter ID"));
        student1=db.searchRecord(student1);
        if(student1.getId()==-1){
            System.out.println("Record not found");
        }
           
        
        
     return (student1);
    }
    
   
}
