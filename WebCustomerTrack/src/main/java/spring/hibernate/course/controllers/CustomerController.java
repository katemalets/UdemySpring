package spring.hibernate.course.controllers;

import spring.hibernate.course.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private spring.hibernate.course.service.CustomerService CustomerService;

    @GetMapping("/list")
    public String showCustomers(Model model){
        List<Customer> customers = CustomerService.getCustomers();
        model.addAttribute("customers", customers);
        return "list-customers";
    }
}
