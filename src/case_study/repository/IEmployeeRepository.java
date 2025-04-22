package case_study.repository;

import case_study.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public interface IEmployeeRepository {

    List<Employee> findAll();
}
