
package Lecture12;


public class Person {
    private int id;
    private String full_name;
    
    public Person(){
        this.id=0;
        this.full_name="";
       
    }
    public Person(int id,String full_name){
        this.id=id;
        this.full_name=full_name;
        
        
    }
    public Person(Person p){
        this.id=p.id;
        this.full_name=p.full_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", full_name=" + full_name + '}';
    }
    
    
    
    
}
