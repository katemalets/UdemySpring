package spring.hibernate.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring.hibernate.course.dao.ICustomerDAO;
import spring.hibernate.course.entity.Customer;

@Service
public class CustomerService implements ICustomerService {

	// need to inject customer dao
	@Autowired
	private ICustomerDAO iCustomerDAO;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return iCustomerDAO.getCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer customer) {
		iCustomerDAO.saveCustomer(customer);
	}

	@Override
	@Transactional
	public Customer getCustomer(int id) {
		return iCustomerDAO.getCustomer(id);
	}

	@Override
	@Transactional
	public void deleteCostumer(int id) {
		iCustomerDAO.deleteCustomer(id);
	}

}





