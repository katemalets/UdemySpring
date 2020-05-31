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
    public List<Employee> findAll() {
        return entityManager
                .unwrap(Session.class)
                .createQuery("from Employee ", Employee.class)
                .getResultList();
    }

    @Override
    public Employee findAllById(int id) {
        return entityManager
                .unwrap(Session.class)
                .get(Employee.class,id);
    }

    @Override
    public void save(Employee employee) {
        entityManager
                .unwrap(Session.class)
                .saveOrUpdate(employee);
    }

    @Override
    public void delete(int id) {
        entityManager
                .unwrap(Session.class)
                .createQuery("delete from Employee where id=:employeeId")
                .setParameter("employeeId",id)
                .executeUpdate();
    }
}
