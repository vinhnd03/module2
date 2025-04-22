package case_study.service;

import case_study.entity.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findAll();
}
