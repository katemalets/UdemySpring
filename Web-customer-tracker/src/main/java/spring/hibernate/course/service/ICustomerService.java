package spring.hibernate.course.service;

import spring.hibernate.course.entities.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getCustomers();
}
