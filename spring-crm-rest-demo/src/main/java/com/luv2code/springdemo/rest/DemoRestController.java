package com.luv2code.springdemo.rest;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DemoRestController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> getCustomers(){
        return customerService.getCustomers();
    }

    @GetMapping("/customers/{studentId}")
    public Customer getCustomer(@PathVariable int studentId){
        Customer customer = customerService.getCustomer(studentId);
        if(customer == null){
            throw new CustomerNotFound("Customer id #" + studentId + " is not found");
        }
        return customer;
    }

    @PostMapping("/customers")
    public Customer addCustomer(@RequestBody Customer customer){
        customer.setId(0);
        customerService.saveCustomer(customer);
        return customer;
    }

    @PutMapping("/customers")
    public Customer updateCustomer(@RequestBody Customer customer){
        customerService.saveCustomer(customer);
        return customer;
    }

    @DeleteMapping("/customers/{studentId}")
    public String deleteCustomer(@PathVariable int studentId){
        Customer customer = customerService.getCustomer(studentId);
        if(customer == null){
            throw new CustomerNotFound("Customer id #" + studentId + " is not found");
        }
        customerService.deleteCustomer(studentId);
        return "Customer id #" + studentId + " is deleted";
    }
}
