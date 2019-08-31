
package Lecture19;
import java.io.File;
import java.io.FileWriter;
public class Write {
    public static void main(String[] args) {
        FileWriter fw; //Writes contents on file
        File file= null;
        try{
            file=new File("D:/MyFiles/data.txt");
            if(file.exists()){
                System.out.println("File already Exists");
            }
            else{
                file.createNewFile();
                System.out.println("New File Created Successfully");
                
            }
            fw=new FileWriter(file);
            //OutputStreamWriter
                // public void write(int c)
                //public void write(char[] cbuf,int off,int len)
                //public void write(String str,int off,int len)
            
            //Writer
                //public Writer append(char c)
                //public Writer append(CharSequence csq)
                //public Writer append(CharSequence csq,int start,int end)
                //public void write(String str)
            //close and flush
           // int n=10; //local variable
            //fw.write(n);
            char chs[]={'a','b','c','d','e'};
            fw.write(chs,0,chs.length);
            fw.flush();
            fw.close();
            System.out.println("File Written Successfully");
            
            
        }catch(Exception ex){
            System.out.println("Error:"+ex);
            
        }
        finally{
            file=null;
        }
    }
    
}
