
package Lecture20;
import java.util.Scanner;

public class UserClass {
    
    public static void main(String[] args) {
        double fn,sn,sum;
        String user;
        String str1="The first number Entered was";
        String str2="The second number was";
        String str3="The result is ";
        
        System.out.println("Enter First number");
        fn=new Scanner(System.in).nextDouble();
        System.out.println("Enter Second Number");
        sn=new Scanner(System.in).nextDouble();
        //sum=fn+sn;
        Calculation c1=new Calculation();
        sum=c1.doAdd(fn,sn);
        System.out.println("the result is "+sum);
        System.out.println("Enter yes to save it in the file");
        user=new Scanner(System.in).nextLine();
        
        
        if ((user.equals("yes"))||(user.equals("Yes"))){
            IOclass io=new IOclass();
            
        
        }
        
    }
    
}
