package thymeleaf.spring.boot.thymeleafdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employees/employee-form";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("employeeId") int id,
                                    Model model){
        Employee employee = iEmployeeService.findAllById(id);
        model.addAttribute("employee", employee);
        return "employees/employee-form";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        iEmployeeService.save(employee);
        return "redirect:/employees/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("employeeId") int id){
        iEmployeeService.delete(id);
        return "redirect:/employees/list";
    }
}
