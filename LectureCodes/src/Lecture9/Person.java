
package Lecture9;


public class Person {
    int id;
    String name;
    String address;
    //Initializer
    public Person(){//Default
        this.id=0;
        this.name="";
        this.address="";
    }
    
    public Person(int id, String name, String address){//Parameterized
        this.id=id;
        this.name=name;
        this.address=address;
    }
    
    //Setters
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAddress(String address){
        this.address=address;
    }
    //Getters
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }@Override
    public String toString(){
        return(this.id+", "+this.name+", "+this.address);
    
}
}
