package spring.rest.course.demo;

public class Student {

    private int id;

    private String firstname;

    private String lastname;

    private boolean active;

    public Student(){

    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public boolean isActive() {
        return active;
    }

    public void setAtive(boolean ative) {
        this.active = active;
    }
}
