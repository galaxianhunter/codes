
package Lecture20;
import java.io.File;
import java.io.FileWriter;

public class IOclass {
    public static void main(String[] args) {
        File file;
        String str1="";
        
        try{
            file =new File("D:/java.txt");
            FileWriter fw=new FileWriter(file);
            
      
        }catch(Exception ex){
            System.out.println("Error:"+ex);
            
        }
        
        
    }
    
}
