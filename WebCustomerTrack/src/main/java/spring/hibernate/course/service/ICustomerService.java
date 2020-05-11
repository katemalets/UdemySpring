package spring.hibernate.course.service;

import java.util.List;

import spring.hibernate.course.entity.Customer;

public interface ICustomerService {

	List<Customer> getCustomers();

	void saveCustomer(Customer customer);

	Customer getCustomer(int id);

	void deleteCostumer(int id);
}
