package vn.codegym.test_farm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.test_farm.model.Employee;
import vn.codegym.test_farm.repository.IEmployeeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceIpml implements IEmployeeService {
    @Autowired
    private IEmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAllEmployee() {
        return employeeRepository.findAll();
    }

//    @Override
//    public void create(Employee employee) {
//        employeeRepository.save(employee);
//    }
//
//    @Override
//    public void edit(Employee employee) {
//        employeeRepository.save(employee);
//    }

    @Override
    public void delete(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Optional<Employee> findById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public void save(Employee employee) {
        this.employeeRepository.save(employee);
    }

    @Override
    public void update(Long id, Employee employee) {
        employee.setId(id);
        employeeRepository.save(employee);
    }
}
