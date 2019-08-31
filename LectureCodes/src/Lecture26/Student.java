
package Lecture26;


public class Student {
    private int id;
    private String full_name;
    private String contact_address;
    public Student() {
        this.id = -1;
        this.full_name ="" ;
        this.contact_address ="";
    }

    public Student(int id, String full_name, String contact_address) {
        this.id = id;
        this.full_name = full_name;
        this.contact_address = contact_address;
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

    public String getContact_address() {
        return contact_address;
    }

    public void setContact_address(String contact_address) {
        this.contact_address = contact_address;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", full_name=" + full_name + ", contact_address=" + contact_address + '}';
    }
    
    
    
    
}
