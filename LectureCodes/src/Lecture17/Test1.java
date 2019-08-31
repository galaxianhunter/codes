
package Lecture17;


public class Test1 {
    public static void main(String[] args) {
        Mythread1 t1=new Mythread1();
        Mythread1 t2=new Mythread1();
        t1.run();
        t2.run();
        
        Mythread2 t01=new Mythread2();
         Mythread2 t02=new Mythread2();
         t01.run();
         t02.run();
         
         
         Mythread3 t31=new Mythread3("TO31",1,50,2000);
         Mythread3 t32= new Mythread3("T032",100,200,1000);
         t31.start();
         t32.start();
         
         
        //for implementation of runnable interface use only run 
         // for extend process can use either 
         //start method masks the run method 
         
         
        
    }
    
}
