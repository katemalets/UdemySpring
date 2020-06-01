package thymeleaf.spring.boot.thymeleafdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import thymeleaf.spring.boot.thymeleafdemo.entity.Employee;
import thymeleaf.spring.boot.thymeleafdemo.service.IEmployeeService;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class DemoController {

    @GetMapping("/hello")
    public String sayHello(Model model){
        model.addAttribute("data", new java.util.Date());
        return "helloworld";
    }

    private IEmployeeService iEmployeeService;

    @Autowired
    public DemoController(IEmployeeService iEmployeeService) {
        this.iEmployeeService = iEmployeeService;
    }

    @GetMapping("/list")
    public String listEmployee(Model model){
        List<Employee> employees = iEmployeeService.findAll();
        model.addAttribute("employees", employees);
        return "employees/list-employees";
    }
}
