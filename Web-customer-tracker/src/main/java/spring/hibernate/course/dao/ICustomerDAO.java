package spring.hibernate.course.dao;

import spring.hibernate.course.entities.Customer;

import java.util.List;

public interface ICustomerDAO {
    List<Customer> getCustomers();
}
