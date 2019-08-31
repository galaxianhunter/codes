
package Lecture9;


public class NewPerson {
    private String email;
    
    public NewPerson(){
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
