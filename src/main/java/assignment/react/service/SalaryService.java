package assignment.react.service;

import assignment.react.entity.Salary;

import java.util.List;

public interface SalaryService {
    List<Salary> listSalaries();
    Salary findSalary(long id);
}


