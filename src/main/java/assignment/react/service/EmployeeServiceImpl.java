package assignment.react.service;

import assignment.react.entity.Employee;
import assignment.react.exception.EmployeeNotFoundException;
import assignment.react.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository EmployeeRepository;

    @Override
    public List<Employee> listEmployee() {
        return (List<Employee>) EmployeeRepository.findAll();
    }

    @Override
    public Employee findEmployee(long id) {
        Optional<Employee> optionalEmployee = EmployeeRepository.findById(id);

        if(optionalEmployee.isPresent())
            return optionalEmployee.get();
        else
            throw new EmployeeNotFoundException("Employee Not Found");
    }



}
