package vn.codegym.test_farm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.codegym.test_farm.model.Employee;
import vn.codegym.test_farm.service.IEmployeeService;
import vn.codegym.test_farm.service.IUserService;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;
    private IUserService userService;

    @RequestMapping("/employee")
    public ResponseEntity<Page<Employee>> findAllEmployee(@PageableDefault(value = 2) Pageable pageable) {
        Page<Employee> employees = employeeService.findAll(pageable);
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Employee>   deleteEmployee(@PathVariable Long id) {
        Optional<Employee> employeeOptional = employeeService.findById(id);
        if (!employeeOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        employeeService.delete(id);
        return new ResponseEntity<>(employeeOptional.get(), HttpStatus.NO_CONTENT);
    }
}
