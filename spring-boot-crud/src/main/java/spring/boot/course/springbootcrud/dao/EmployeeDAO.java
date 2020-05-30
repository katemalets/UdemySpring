package spring.boot.course.springbootcrud.dao;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import spring.boot.course.springbootcrud.entity.Employee;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAO implements IEmployeeDAO {

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAO(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Employee> findAll() {
        return entityManager
                .unwrap(Session.class)
                .createQuery("from Employee ", Employee.class)
                .getResultList();
    }
}
