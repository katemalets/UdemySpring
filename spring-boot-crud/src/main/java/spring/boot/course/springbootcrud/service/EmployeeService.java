package spring.boot.course.springbootcrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.boot.course.springbootcrud.dao.IEmployeeDAO;
import spring.boot.course.springbootcrud.entity.Employee;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {

    private IEmployeeDAO iEmployeeDAO;

    @Autowired
    public EmployeeService(@Qualifier("employeeDAOJPA") IEmployeeDAO iEmployeeDAO) {
        this.iEmployeeDAO = iEmployeeDAO;
    }

    @Override
    @Transactional
    public List<Employee> findAll() {
        return iEmployeeDAO.findAll();
    }

    @Override
    @Transactional
    public Employee findAllById(int id) {
        return iEmployeeDAO.findAllById(id);
    }

    @Override
    @Transactional
    public void save(Employee employee) {
        iEmployeeDAO.save(employee);
    }

    @Override
    @Transactional
    public void delete(int id) {
        iEmployeeDAO.delete(id);
    }
}
