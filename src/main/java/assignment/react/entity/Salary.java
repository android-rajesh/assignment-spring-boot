package assignment.react.entity;

import javax.persistence.*;

@Entity
public class Salary {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    @Column(name = "employee_id", nullable = false)
    private long employeeId;

    @Column(name = "year")
    private long year;

    @Column(name = "salary")
    private long salary;

    public Salary() {
    }

    public Salary(long employee_id, long year, long salary) {
        this.employeeId = employee_id;
        this.year = year;
        this.salary = salary;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) { this.salary = salary;     }

    @Override
    public String toString() {
        return "Application{" +
                "id=" + id +
                ", employeeId='" + employeeId + '\'' +
                ", year=" + year +
                ", salary='" + salary + '\'' +
                '}';
    }
}