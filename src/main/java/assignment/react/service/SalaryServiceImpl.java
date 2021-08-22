package assignment.react.service;

import assignment.react.entity.Salary;
import assignment.react.exception.SalaryNotFoundException;
import assignment.react.repository.SalaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalaryServiceImpl implements SalaryService {
    @Autowired
    private SalaryRepository SalaryRepository;

    @Override
    public List<Salary> listSalaries() {
        return (List<Salary>) SalaryRepository.findAll();
    }

    @Override
    public Salary findSalary(long id) {
        Optional<Salary> optionalSalary = SalaryRepository.findById(id);

        if(optionalSalary.isPresent())
            return optionalSalary.get();
        else
            throw new SalaryNotFoundException("Salary Not Found");
    }

}
