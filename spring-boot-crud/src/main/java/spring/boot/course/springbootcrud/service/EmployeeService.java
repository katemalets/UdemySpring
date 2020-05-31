package spring.boot.course.springbootcrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.boot.course.springbootcrud.dao.EmployeeRepository;
import spring.boot.course.springbootcrud.dao.IEmployeeDAO;
import spring.boot.course.springbootcrud.entity.Employee;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findAllById(int id) {
        Optional<Employee> result = employeeRepository.findById(id);
        Employee employee = null;
        if(result.isPresent()){
            employee = result.get();
        } else {
            throw new RuntimeException("Employee with id #" + id + " is not found");
        }
        return employee;
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void delete(int id) {
        employeeRepository.deleteById(id);
    }

    /**
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

    **/
}
