package spring.hibernate.course.dao;

import java.util.List;

import spring.hibernate.course.entity.Customer;

public interface ICustomerDAO {

	List<Customer> getCustomers();

	void saveCustomer(Customer customer);

	Customer getCustomer(int id);
}
