package spring.boot.course.springbootcrud.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.boot.course.springbootcrud.dao.IEmployeeDAO;
import spring.boot.course.springbootcrud.entity.Employee;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private IEmployeeDAO iEmployeeDAO;

     @Autowired
    public EmployeeRestController(IEmployeeDAO iEmployeeDAO) {
        this.iEmployeeDAO = iEmployeeDAO;
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
         return iEmployeeDAO.findAll();
    }
}
