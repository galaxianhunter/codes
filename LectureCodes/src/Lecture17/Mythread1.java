
package Lecture17;

import java.util.Date;


public class Mythread1 extends Thread{
    @Override
    public void run(){
        System.out.println("Hello"+new Date());
    }
    
    
}
