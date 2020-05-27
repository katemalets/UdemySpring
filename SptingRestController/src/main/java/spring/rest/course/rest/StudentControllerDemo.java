package spring.rest.course.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.rest.course.entity.Student;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentControllerDemo {

    private List<Student> students;

    @PostConstruct
    public void loadStudents(){
        students = new ArrayList<>();
        students.add(new Student("Katya","Malets"));
        students.add(new Student("Ksu","Gavrilova"));
        students.add(new Student("Maxim","Malets"));
    }

    @GetMapping("/students")
    public List<Student> showStudents(){
        return students;
    }

    @GetMapping("/students/{studentId}")
    public Student showStudentBuId(@PathVariable int studentId){
        return students.get(studentId);
    }
}
