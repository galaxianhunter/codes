
package Lecture14;
import java.util.ArrayList;//class
import java.util.List;// intrface


public class test1 {
    public static void main(String[] args) {
        int num1;
        int max=5;
        int num[]=new int [max];//fixed size array
        List list =new ArrayList(); //try tto remember this line of codw
        list.add(1);
        list.add(100);
        list.add(200);
        //....
        list.add(43);
        list.add(98);
        list.add(23);
        System.out.println(list.size());//length
        
        System.out.println(list.get(0));//o is the value of index
        list.set(1,300);//update the values of certain index 
        System.out.println(list.get(1));
        
        list.remove(2);
        System.out.println(list.get(2));
        
        
        
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
            
        }
        
    }
    
}
