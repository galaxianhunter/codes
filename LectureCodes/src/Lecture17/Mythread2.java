
package Lecture17;

import java.util.Date;


public class Mythread2 implements Runnable {
    @Override
     public void run(){
         System.out.println("hello"+new Date());
     }
    
}
