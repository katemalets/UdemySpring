package spring.boot.course.springbootcrud.dao;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spring.boot.course.springbootcrud.entity.Employee;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAOJPA implements IEmployeeDAO {

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOJPA(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        return entityManager
                .createQuery("from Employee", Employee.class)
                .getResultList();
    }

    @Override
    public Employee findAllById(int id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    public void save(Employee employee) {
        Employee dbemployee = entityManager.merge(employee);
        employee.setId(dbemployee.getId());
    }

    @Override
    public void delete(int id) {
        entityManager
                .createQuery("delete from Employee where id=:employeeId")
                .setParameter("employeeId", id)
                .executeUpdate();
    }
}
