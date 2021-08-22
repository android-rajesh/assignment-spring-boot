package assignment.react.repository;
import assignment.react.entity.Salary;
import org.springframework.data.repository.CrudRepository;

public interface SalaryRepository extends CrudRepository<Salary, Long> {
}
