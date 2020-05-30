package spring.boot.course.springbootcrud.dao;

import spring.boot.course.springbootcrud.entity.Employee;

import java.util.List;

public interface IEmployeeDAO {

    List<Employee> findAll();
}
