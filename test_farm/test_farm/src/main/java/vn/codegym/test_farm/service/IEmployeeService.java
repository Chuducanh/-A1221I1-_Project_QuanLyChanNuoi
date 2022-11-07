package vn.codegym.test_farm.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.test_farm.model.Employee;

import java.util.Optional;

public interface IEmployeeService {
//    List<Employee> findAllEmployee();
    Page<Employee> findAll(Pageable pageable);
    void create(Employee employee);
    void edit (Long id);
    void delete(Long id);
    Optional<Employee> findById(Long id);
}
