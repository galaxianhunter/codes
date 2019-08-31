
package Lecture16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class test2 {
    public static void main(String[] args) {
        try{
            String str_name=null;
            System.out.println("Enter Your name");
            str_name=readString();
            System.out.println("NAME:"+str_name);
        }catch(Exception ex){
            System.out.println("Error:"+ex);
            
        }
        
    }
    public static String readString(){
        InputStreamReader isr=null;
        BufferedReader br=null;
        String tmp=null;
        
        try{
         isr=new InputStreamReader(System.in);
         br=new BufferedReader(isr);
         tmp=br.readLine();
        
        }
        catch(IOException ex){
            System.out.println("Error:"+ex);
        }
        return tmp;
    }
    public static String readString1()throws IOException{
        InputStreamReader isr=null;
        BufferedReader br=null;
        String tmp=null;
        
        
         isr=new InputStreamReader(System.in);
         br=new BufferedReader(isr);
         tmp=br.readLine();
        
        return tmp;
        
    }
    
    
}
    
    

 
    

        
    
    
