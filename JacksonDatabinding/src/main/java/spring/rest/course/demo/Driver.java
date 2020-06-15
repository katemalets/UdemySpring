package spring.rest.course.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Driver {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();
        try{

            Student student = mapper.readValue(new File("data/sample-full.json"), Student.class);
            System.out.println("First name : " + student.getFirstname());
            System.out.println("Last name : " + student.getLastname());
            System.out.println("City: " + student.getAdress().getCity());
            System.out.println(Arrays.toString(student.getLanguages()));

        } catch (Exception exc){
            exc.printStackTrace();
        }
    }
}
