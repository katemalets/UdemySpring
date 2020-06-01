package thymeleaf.spring.boot.thymeleafdemo.service;


import thymeleaf.spring.boot.thymeleafdemo.entity.Employee;

import java.util.List;

public interface IEmployeeService {

    List<Employee> findAll();

    Employee findAllById(int id);

    void save(Employee employee);

    void delete(int id);
}
