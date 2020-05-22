package spring.hibernate.course.controllers;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import spring.hibernate.course.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import spring.hibernate.course.service.CustomerService;
import spring.hibernate.course.service.ICustomerService;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private ICustomerService iCustomerService;

    @GetMapping("/list")
    public String showCustomers(Model model){
        List<Customer> customers = iCustomerService.getCustomers();
        model.addAttribute("customers", customers);
        return "list-customers";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model){
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "customer-form";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer){
        iCustomerService.saveCustomer(customer);
        return "redirect:/customer/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("customerId") int id,Model model){
        Customer customer = iCustomerService.getCustomer(id);
        model.addAttribute(customer);
        return "customer-form";
    }

    @GetMapping("/deleteCustomer")
    public String deleteCustomer(@RequestParam("customerId") int id, Model model){
        iCustomerService.deleteCostumer(id);
        return "redirect:/customer/list";
    }
}
