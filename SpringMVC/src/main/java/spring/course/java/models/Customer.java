package spring.course.java.models;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {

    private String firstName;

    @NotNull(message = "you have to fill it in, guy!")
    @Size(min = 1, message = "is required")
    private String lastName;

    @Min(value = 0, message = "this num have to be >= 0")
    @Max(value = 10, message = "this num have to be  <= 10")
    private int freePasses;

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getFreePasses(){
        return freePasses;
    }

    public void setFreePasses(int freePasses){
        this.freePasses = freePasses;
    }
}
