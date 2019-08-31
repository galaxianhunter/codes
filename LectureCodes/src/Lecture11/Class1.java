
package Lecture11;
//1.Encapsulation
//2.Inheritance(extends,overriding,final ,super
//3.abstraction(Method without body

public abstract class Class1 {//Abstract class cannot ceatr objects
    //generak Method -can be overridden
    
    int a;
    int b;
    
    public void f1(){
        System.out.println("hello from f1");
    }
    
    //final method cannot be Override
    public final void f2(){
        System.out.println("hello from h2");
    }
    
    //Abstract method-must override
    public abstract void f3();
    
}
