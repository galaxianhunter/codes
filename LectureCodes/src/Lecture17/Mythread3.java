
package Lecture17;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Mythread3 extends Thread{
   private  String thread_name;
   private int start_no;
   private int stop_no;
   private int interval;

    public String getThread_name() {
        return thread_name;
    }

    public void setThread_name(String thread_name) {
        this.thread_name = thread_name;
    }
    public Mythread3(String thread_name,int start_no,int stop_no,int interval){
        this.thread_name=thread_name;
        this.start_no=start_no;
        this.stop_no=stop_no;
        this.interval=interval;
    }
    @Override
    public void run (){
        try{
            for(;start_no<=stop_no;start_no++){
                System.out.println(this.getThread_name()+""+start_no);
                 Thread.sleep(interval);
            }
          
       } catch (InterruptedException ex) {
           System.out.println("Error:"+ex.getMessage());
       }
    }
    
}
