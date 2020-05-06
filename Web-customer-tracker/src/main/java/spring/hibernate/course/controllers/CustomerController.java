package spring.hibernate.course.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.hibernate.course.dao.ICustomerDAO;
import spring.hibernate.course.entities.Customer;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private ICustomerDAO iCustomerDAO;

    @RequestMapping("/list")
    public String showCustomers(Model model){
        List<Customer> customers = iCustomerDAO.getCustomers();
        model.addAttribute("customers", customers);
        return "list-customers";
    }
}
