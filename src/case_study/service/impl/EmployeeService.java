package case_study.service.impl;

import case_study.entity.Employee;
import case_study.repository.IEmployeeRepository;
import case_study.repository.impl.EmployeeRepository;
import case_study.service.IEmployeeService;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    private IEmployeeRepository repository = new EmployeeRepository();

    @Override
    public List<Employee> findAll() {
        return repository.findAll();
    }

    @Override
    public void add(Employee employee) {
        repository.add(employee);
    }

    @Override
    public Employee findById(String id) {
        return repository.findById(id);
    }

    @Override
    public void update(Employee employee) {
        repository.update(employee);
    }
}
