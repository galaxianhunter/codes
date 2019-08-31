
package Lecture11;

//Static Class- Class have constraints (Fixed value variable)-Read only variarble
public class Class4 {
    
    //declare Static variables- can access direct through class name(Classname.variable);
    public static int MAX=10;
    
    public static double PI=3.14;
    public static String OFFICE_NAME="Broadway Infosys";
    
    private int n1;//Non Static variable can access through object only (object.variable) 
     public Class4(){
        this.n1=0;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }
   
    
    
}
