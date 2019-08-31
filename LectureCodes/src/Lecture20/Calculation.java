
package Lecture20;


public class Calculation {
    double n1,n2,n3,n4;
    public Calculation(){
        n1=0;
        n2=0;
    }
    public Calculation(double n1,double n2){
        this.n1=n1;
        this.n2=n2;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }
    public double doAdd(double n1,double n2){
        return n1+n2;
    }

    @Override
    public String toString() {
        return "Calculation{" + "n1=" + n1 + ", n2=" + n2 + ", n3=" + n3 + ", n4=" + n4 + '}';
    }
    
    
}
