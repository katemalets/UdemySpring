package spring.boot.course.springbootcrud.service;

import spring.boot.course.springbootcrud.entity.Employee;

import java.util.List;

public interface IEmployeeService {

    List<Employee> findAll();

    Employee findAllById(int id);

    void save(Employee employee);

    void delete(int id);
}
