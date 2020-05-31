package spring.boot.course.springbootcrud.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.boot.course.springbootcrud.dao.IEmployeeDAO;
import spring.boot.course.springbootcrud.entity.Employee;
import spring.boot.course.springbootcrud.service.IEmployeeService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private IEmployeeService iEmployeeService;

    @Autowired
    public EmployeeRestController(IEmployeeService iEmployeeService) {
        this.iEmployeeService = iEmployeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
         return iEmployeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee findAllById(@PathVariable int employeeId){
        Employee employee = iEmployeeService.findAllById(employeeId);
        if (employee == null){
            throw  new RuntimeException("Employee with id #" + employeeId + " is not found");
        }
        return employee;
    }

    @PostMapping("/employees")
    public Employee save(@RequestBody Employee employee){
        employee.setId(0);
        iEmployeeService.save(employee);
        return employee;
    }

    @PutMapping("/employees")
    public Employee update(@RequestBody Employee employee){
        iEmployeeService.save(employee);
        return employee;
    }

    @DeleteMapping("/employees/{employeeId}")
        public String delete(@PathVariable int employeeId) {
        if (iEmployeeService.findAllById(employeeId) == null){
            throw  new RuntimeException("Employee with id #" + employeeId + " is not found");
        }
        iEmployeeService.delete(employeeId);
        return "Employee wit id #" + employeeId + " is deleted";
    }
}
