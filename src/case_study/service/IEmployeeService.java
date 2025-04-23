package case_study.service;

import case_study.entity.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findAll();

    void add(Employee employee);

    Employee findById(String id);

    void update(Employee editedEmployee);
}
