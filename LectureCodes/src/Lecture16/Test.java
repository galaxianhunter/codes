
package Lecture16;
import java.io.File;

public class Test {
    public static void main(String[] args) {
                //exceptions
            
    //Number Format Exception           -type convert string to numeric
    //Arithmetic formatException         -number divide by zero
    //ArrayindexoutOf Bound Exception    -accessing or assigning <0 or >length of arrray index
    //string indexout of bound exception -same as above 
    //file not found exception           -file doesnot exist in drive 
    //NullPointer Exception              -accessing object resources without initializing
        
        
        String str1="123",str2="345";
        double dn1,dn2,dn3;
        int nums[]={6,7,8,9,10};
        String str3="Kathmandu Nepal";
        File file;
        try{
            dn1=Double.parseDouble(str1);
            dn2=Double.parseDouble(str2);
            dn3=dn1/dn2;
            System.out.println(nums[0]);    //java.lang.ArrayIndexOutOfBoundsException:
            System.out.println(str3.charAt(0));
            file=new File("D:\\testin1.txt"); //FilenotFoundException
            file.delete();
        }
        catch(NumberFormatException ex){
            System.out.println("Error1:"+ex);
            
        }
        catch(ArithmeticException ex){
            System.out.println("Error2:"+ex);
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Error3:"+ex);
        }
        catch(StringIndexOutOfBoundsException ex){
            System.out.println("Error4:"+ex);
        }
        catch(Exception e){
            System.out.println("Error:"+e);
        }
        
        finally{
            System.out.println("Finally");
        }
        
         
        
        
    }
    
    
    
}
