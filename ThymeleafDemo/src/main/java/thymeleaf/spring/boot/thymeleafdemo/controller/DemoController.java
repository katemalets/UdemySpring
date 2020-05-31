package thymeleaf.spring.boot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import thymeleaf.spring.boot.thymeleafdemo.entity.Employee;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
public class DemoController {

    @GetMapping("/hello")
    public String sayHello(Model model){
        model.addAttribute("data", new java.util.Date());
        return "helloworld";
    }

    private List<Employee> employees;

    @PostConstruct
    public void loadData() {
        Employee employee1 = new Employee(1, "Katya", "Malets", "katya@mail");
        Employee employee2 = new Employee(2, "Ksu", "Gavrilova", "ksu@mail");
        Employee employee3 = new Employee(3, "Dima", "Fedchenko", "dima@icloud");

        employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
    }

    @GetMapping("/employee")
    public String listEmployee(Model model){
        model.addAttribute("employees", employees);
        return "list-employees";
    }
}
