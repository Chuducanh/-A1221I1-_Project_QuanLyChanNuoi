package vn.codegym.test_farm.service;

import vn.codegym.test_farm.model.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {
    List<Employee> findAllEmployee();
    void delete(Long id);
    Optional<Employee> findById(Long id);
    void save(Employee employee);
    void update(Long id, Employee employee);
}
