
package Lecture12;


public class Test {
    public static void main(String[] args) {
        Mymethods obj=new Mymethods();
        String str=obj.readString();
        
        double n1=obj.calcSum(20,70);
        obj.print_message("Result",(int)n1);
        
        
        int num1,num2;
        num1=90;
        num2=100;
        System.out.println("num1="+num1+",n2="+num2);
        obj.swapInt(num1, num2);//pass by value mechanism
        System.out.println("num1="+num1+",n2="+num2);
        
        //pass by reference
        int nums[]={3,4,5,6,7};
        obj.updatearray(nums);
        
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+"");
        
         }
        System.out.print("");
        
        //Person
        
        Person p1=new Person(1,"Sandip Agrahari");
        System.out.println(p1);
        obj.updateFullName(p1);
        System.out.println(p1);
        
         int nums4[];
    Person persons[];
    
     nums4=new int[2];
    persons=new Person[2];
    
    nums4[0]=9;
    nums4[1]=10;
    
    
    
        
    }
    
}
