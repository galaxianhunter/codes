
package Lecture14;

public class Class1 implements INf1,INf2{
    @Override 
    public void f1(){
        System.out.println("Hello from inf1.f1()");
    }
    @Override
    public void f2(){
        System.out.println("Hello from inf1.f2()");
    }
    @Override
    public void f3(){
        System.out.println("Hello from inf2.f3()");
    }@Override
    public void f4(){
        System.out.println("Hello from inf2.f4()");
    }
    
}
