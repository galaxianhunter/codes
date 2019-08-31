
package Lecture9;


public class Programmer extends Employee {
    int bonus=10000;
    public static void main(String[] args) {
        Programmer p=new Programmer();
        System.out.println("Programmer saalary is :"+p.salary);
        System.err.println("Programmer bonus is:"+p.bonus);
    }
            
}
