package assignment.react.service;

import assignment.react.entity.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> listDepartment();
    Department findDepartment(long id);
}


