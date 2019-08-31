
package Lecture19;
import java.io.File;
import java.io.FileReader;

public class Reader1 {
    public static void main(String[] args) {
        try {
            FileReader fr=new FileReader(new File(Global.FILE_NAME));
           // System.out.println(fr.read());
            int n;
            while((n=fr.read())!=-1){
                System.out.println((char)n);
                
            }
            
        } catch (Exception ex) {
            System.out.println(ex);
            
           
        }
    }
    
}
