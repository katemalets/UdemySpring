package spring.course.java.models;

import javax.validation.constraints.*;

public class Customer {

    private String firstName;

    @NotNull(message = "you have to fill it in, guy!")
    @Size(min = 1, message = "is required")
    private String lastName;

    @NotNull(message = "you have to fill it in, guy!")
    @Pattern(regexp = "^-?[\\d]+", message = "invalid number")
    @Min(value = 0, message = "this num have to be >= 0")
    @Max(value = 10, message = "this num have to be  <= 10")
    private String freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 letters friend")
    private String postalCode;

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

    public String getFreePasses(){
        return freePasses;
    }

    public void setFreePasses(String freePasses){
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
