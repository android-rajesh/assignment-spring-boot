package assignment.react.web;
import assignment.react.entity.*;
import assignment.react.exception.DepartmentNotFoundException;
import assignment.react.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {
    private SalaryService salaryService;
    private EmployeeService employeeService;
    private DepartmentService departmentService;

    @Autowired
    public void setDepartmentService(DepartmentService departmentService) { this.departmentService = departmentService; }

    @Autowired
    public void setSalaryService(SalaryService salaryService) { this.salaryService = salaryService; }

    @Autowired
    public void setEmployeeService(EmployeeService employeeService) { this.employeeService = employeeService; }

    @GetMapping("/salaries")
    public ResponseEntity<List<Salary>> getAllSalaries() {
        List<Salary> list = salaryService.listSalaries();
        return new ResponseEntity<List<Salary>>(list, HttpStatus.OK);
    }

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> list = employeeService.listEmployee();
        return new ResponseEntity<List<Employee>>(list, HttpStatus.OK);
    }

    @GetMapping("/departments")
    public ResponseEntity<List<Department>> getAllDepartments() {
        List<Department> list = departmentService.listDepartment();
        return new ResponseEntity<List<Department>>(list, HttpStatus.OK);
    }

    @GetMapping("/department/{id}")
    public ResponseEntity<Department> getDepartment(@PathVariable("id") long id) {
        try {
            return new ResponseEntity<Department>(departmentService.findDepartment(id),
                    HttpStatus.OK);
        } catch (DepartmentNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Department Not Found");
        }
    }
}