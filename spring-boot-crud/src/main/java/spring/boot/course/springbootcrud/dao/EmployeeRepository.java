package spring.boot.course.springbootcrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.boot.course.springbootcrud.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
