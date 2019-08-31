
package Lecture10;
import Lecture9.Person;


public class NewPerson extends Person{
    private String email;
    private String mobile;
    
    
    public NewPerson(){
        super();  //calls Superclassdefault Constructor
        this.email="";
        this.mobile="";
    }
    public NewPerson(int id, String name,String address,String email, String mobile){
        super(id,name,address);
        this.email=email;
        this.mobile=mobile;
    }
    //getters
    @Override    //not compulsory
    public int getId(){ //method overriding
        return super.getId();
    }
    
     //not compulsory
    public String getname(){
        return super.getName();
    }
    
    public String getaddress(){
        return super.getAddress();}
     

    public String getEmail(){   
        return this.email;

}

public String GetMobile(){
return this.mobile;
}

//setters

@Override
public void setId(int id){
 super.setId(id);}

@Override
public void setName(String name ){

super.setName(name);
}

public void setAddress(String address){
super.setAddress(address);}

public void setEmail(String email){
this.email=email;
}
public void setMobile(String mobile){
this.mobile=mobile;}

public String toString(){
return (super.getId()+""+super.getName()+""+super.getAddress()+"");}


    
}
