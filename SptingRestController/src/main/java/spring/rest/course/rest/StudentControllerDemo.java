package spring.rest.course.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.rest.course.entity.Student;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentControllerDemo {

    @GetMapping("/students")
    public List<Student> showStudents(){
        List<Student> students = new ArrayList<>();

        students.add(new Student("Katya","Malets"));
        students.add(new Student("Ksu","Gavrilova"));
        students.add(new Student("Maxim","Malets"));

        return students;
    }
}
