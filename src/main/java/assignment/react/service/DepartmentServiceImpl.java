package assignment.react.service;

import assignment.react.entity.Department;
import assignment.react.exception.DepartmentNotFoundException;
import assignment.react.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public List<Department> listDepartment() {
        return (List<Department>) departmentRepository.findAll();
    }

    @Override
    public Department findDepartment(long id) {
        Optional<Department> optionalDepartment = departmentRepository.findById(id);

        if(optionalDepartment.isPresent())
            return optionalDepartment.get();
        else
            throw new DepartmentNotFoundException("Department Not Found");
    }

}
