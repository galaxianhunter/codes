

package Lecture9;



public class Test2 {
    public static void main(String[] args) {
        NewPerson_1 p1=new NewPerson_1();
        p1.setId(1);
        p1.setName("kehor");
        p1.setAddress("KTM");
        p1.setEmail("keshor@gmail.com");
        
        
        System.out.println(p1.getId());
        Newperson2 p2=new Newperson2();
        p2.setID(5);
        System.out.println(p2.getID());
    }
    
}
