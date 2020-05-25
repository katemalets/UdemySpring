package demo;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.nio.file.Paths;

public class Driver {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();
        try{
            Student student = mapper.readValue(Paths.get("sample-lite.json").toFile(),Student.class);
            System.out.println("First name : " + student.getFirstname());
            System.out.println("Last name : " + student.getLastname());

        } catch (Exception exc){
            exc.printStackTrace();
        }
    }
}
