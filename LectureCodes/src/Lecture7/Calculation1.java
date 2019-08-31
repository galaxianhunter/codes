
package Lecture7;


public class Calculation1 {
    int num1=0;
    int num2=0;
    public Calculation1(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    @Override
    public String toString(){
        return (this.num1 +","+this.num2);
    }
    public static void main(String[] args) {
        new MainWindow1();
    }
    
}
