package spring.hibernate.course.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spring.hibernate.course.entities.Customer;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class CustomerDAO implements ICustomerDAO {

//    SessionFactory sessionFactory = new Configuration()
//            .configure("hibernate.cfg.xml")
//            .addAnnotatedClass(Customer.class)
//            .buildSessionFactory();
//    Session session = sessionFactory.getCurrentSession();

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Customer> getCustomers() {
        Session session = sessionFactory.getCurrentSession();
        Query<Customer> query = session.createQuery(
                "from Customer",Customer.class);
        return query.getResultList();
    }
}
