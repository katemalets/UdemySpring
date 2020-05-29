package spring.rest.course.demo;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Driver {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();
        try{

            Student student = mapper.readValue(new File("data/sample-lite.json"),Student.class);
            System.out.println("First name : " + student.getFirstname());
            System.out.println("Last name : " + student.getLastname());

        } catch (Exception exc){
            exc.printStackTrace();
        }
    }
}
