
package Lecture14;

public class Test {
    public static void main(String[] args) {
        Class1 obj1=new Class1();
       obj1.f1();
       obj1.f2();
       obj1.f3();
       obj1.f4();
       
       INf1 obj2=obj1; 
       obj2.f1();
       obj2.f2();
      // obj2.f3();//can't access
       //obj2.f4();// can't access
       
       INf2 obj3=obj1;
      // obj3.f1();// can't access
       //obj3.f2();//cant access
       
       obj3.f3();
       obj3.f4();
       
       
       new MyWindow();
    
    }
    
}
