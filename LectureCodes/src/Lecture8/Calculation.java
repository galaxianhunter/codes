
package Lecture8;


public class Calculation {
    int num1;
    int num2;
    public Calculation(){
        num1=0;
        num2=0;
    }
    public Calculation(int num1,int num2){
       this.num1=num1;
       this.num2=num2;
       
        
    }
    public int getnum1(){
        return num1;
    }
    public void setnum1(int num1){
        this.num1=num1;
    }
    public int getnum2(){
        return num2;
    }
    public void setnum2(int num2){
        this.num2=num2;
    }
    @Override
    public String toString(){
        return "Calculation{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
    public int doADD(){
        return (this.num1+this.num2);
    }
    public int doDif(){
        return (this.num1-this.num2);
    }
    public int doPro(){
        return (this.num1*this.num2);
    }
    public int doADiv(){
        return (this.num1/this.num2);
    }
    public double  doPow(){
        return Math.pow(this.num1,this.num2);
    }
    
  
    
}
