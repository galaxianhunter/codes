
package Lecture19;
import java.io.File;
import java.io.FileReader;

public class Reader {
    public static void main(String[] args) {
         File file;
        FileReader fr;
        try{
            file=new File(Global.FILE_NAME);
            fr=new FileReader(file);
            //Filereader
                //public int read()
               
            //int res=fr.read();
            //System.out.println(res);
            
            char[]chs =new char[Global.MAX];
            fr.read(chs,0,Global.MAX);
            for(int i=0;i<Global.MAX;i++){
                System.out.print(chs[i]);
            }
            
            
            fr.close();
                
        }
        catch(Exception ex){
            System.out.println("Error:"+ex);
    
        }
    }
    
}
