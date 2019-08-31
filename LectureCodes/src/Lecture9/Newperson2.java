
package Lecture9;


public class Newperson2 extends Person {
     private String email;
    
    public Newperson2(){
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
    public void setID(int id){
        super.setId(id);
    }
    public int getID(){
        return super.getId();
    }
    
}
