
package Lecture19;
import java.io.File;
import java.io.FileWriter;
public class Append {
    public static void main(String[] args) {
        File file;
        FileWriter fw;
        
        try{
            file=new File(Global.FILE_NAME);
            fw=new FileWriter(file,true);
            char ch ='f';
            fw.append(ch);
            
            fw.close();
            System.out.println("Content Appended");
            
        }catch(Exception ex){
            System.out.println("Error"+ex);
        }
        
    }
    
}
