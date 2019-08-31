
package Lecture17;

import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        int age;
        try{
        System.out.println("Enter any number (15-30):");
        age=new Scanner(System.in).nextInt();
        if(age<15 ||age>30)
            throw new NumberException("Number range Exception");  //throw object of user defined Exception
        System.out.println("Number :"+age);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
}
