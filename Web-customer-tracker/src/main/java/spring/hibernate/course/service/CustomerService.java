package spring.hibernate.course.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.hibernate.course.dao.ICustomerDAO;
import spring.hibernate.course.entities.Customer;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class CustomerService implements ICustomerService {

    @Autowired
    private ICustomerDAO iCustomerDAO;

    @Override
    @Transactional
    public List<Customer> getCustomers() {
        return iCustomerDAO.getCustomers();
    }
}
