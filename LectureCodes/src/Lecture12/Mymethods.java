
package Lecture12;

import java.util.Scanner;


public class Mymethods {
    public void print_message(){
        System.out.println("hello world of method");
    }
    public void print_message(String label,String value){//method overloading
        System.out.println(label+""+value);
        
    }
    public void print_message(String label,int  value){//method overloading
        System.out.println(label+""+value);
        
    }
    
    public String readString(){
       return(new Scanner(System.in).nextLine()); 
    }
    public double calcSum(double n1,double n2){
        return (n1+n2);
    }
    public void swapInt(int n1,int n2){
        int tmp=n1;
        n1=n2;
        n2=tmp;
        System.out.println("n1="+ n1 +",n2="+n2);
        
    }
    public void updatearray(int nums[]){
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]+1;
        }
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+"");
        }
        System.out.print("");
    }
    
    public void updateFullName(Person p){
        p.setFull_name(p.getFull_name().toUpperCase());
    }
    
    
    
    
   
    
    
}
