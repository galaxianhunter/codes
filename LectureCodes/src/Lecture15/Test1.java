
package Lecture15;

import java.util.ArrayList;
import java.util.List;
import Lecture12.Person;

public class Test1 {
    public static void main(String[] args) {
        List list1=new ArrayList();
        
        Person p1= new Person(1,"Sandip");
        list1.add(1); //0 index
        list1.add(123.45);// 1index
        list1.add(true);
        list1.add("Kathmandu");
        list1.add('A');
        list1.add(p1);
        list1.add(new Person(2,"Mandip"));
        
        System.out.println(list1.size());
        
        
        Person p01 = (Person)list1.get(5);
        System.out.println(p01);
        
        p01.setId(3);
        p01.setFull_name("Gayatri");
        
        System.out.println(p01);
        list1.set(5,p01);
        System.out.println(list1.get(5));
        
        
        Object obj=list1.get(6);
        if (obj instanceof Person){
            System.out.println("True");
            p01=(Person)list1.get(6);
        }
        else 
            System.out.println("False");
        
        
       // list1.get(6).
        
        List list2=new ArrayList<Person>();
        Person p001,p002;
        
        p001=new Person(1,"Krishna");
        p002=new Person(2,"Raj");
        list2.add(p001);
        list2.add(p002);
        Person tmp;
        
        if (list2.get(0)instanceof Person){
            tmp=(Person)list2.get(0);
            System.out.println(tmp);
            tmp.setFull_name("Kiran");
            list2.set(0,tmp); //Update on List2
            
        }
        list2.remove(0);// remove
        
        
        
        
        
    }
    
}
