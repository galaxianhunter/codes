
package Basic_IO;
import java.util.Scanner;

public class BasicIO {
    public static int readint (String message){
        System.out.print(message+"");
        return (new Scanner(System.in).nextInt());
    }
    public static String readString (String message){
        System.out.println(message+"");
        return(new Scanner(System.in).nextLine());
    }
    
}
