package assignment.react.service;

import assignment.react.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> listEmployee();
    Employee findEmployee(long id);
}


