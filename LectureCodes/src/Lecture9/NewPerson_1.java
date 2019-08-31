
package Lecture9;


public class NewPerson_1 extends Person { //all public and protected members are inherited
    private String email;
    
    public NewPerson_1(){
        this.email="";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String toString(){
        return this.email;
    }
     
}
