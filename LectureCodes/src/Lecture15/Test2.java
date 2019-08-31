
package Lecture15;

public class Test2 {
    public static void main(String[] args) {
       /* int a ,b,c;
        a=19;
        b=0;//Exception in thread"main" java.lang.ArithmeticException:
        c=a+b;
        System.out.println(c);*/
        
        
        
        
        //Error or Exception Handling
        //Alert user for abnormal situation (processing)
        //Validation(before processing)
             //Data type
             //range of data
        // Processing-error (Exception)
        
        
        
        // some examples of Exceptions are:
        // Number Format exception
        //ArithmeticException
        //ArrayOutOfBoundsException
        //FileNotFoundException
        //SocketException
        
        //number format Exception
        /*String str="ABC";//same is the case for "123.45"
        //n=str;//Syntax Error //Compile time error
        int n=Integer.parseInt(str);java.lang.NumberFormatException: For input string: "ABC"

        System.out.println(n);*/
        System.out.println("START");
        try{
            String str="ABC";
            double dn=Double.parseDouble(str);
            System.out.println("dn");
        }
        catch(Exception e){
            //System.out.println("Error: Error to convert string to double");
            System.out.println("Error:"+e);
            System.out.println("Error:"+e.getMessage());
        }
        finally{
            System.out.println("finally");
        }
        System.out.println("END");
        
        
        
    }
    
}
