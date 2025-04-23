package case_study.repository.impl;

import case_study.entity.Employee;
import case_study.repository.IEmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static List<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee("NV-0023", "Nguyen Duc Vinh", "12-05-2003", "10111011101",
                true, "0123456789", "ducvinh@gmail.com", "Cao đẳng", "Quản lý", 1000000));
        employees.add(new Employee("NV-0024", "Nguyen Duc Vinh", "12-05-2003", "10111011101",
                true, "0123456789", "ducvinh@gmail.com", "Cao đẳng", "Nhân viên", 1000000));
    }

    @Override
    public List<Employee> findAll() {
        return employees;
    }

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public Employee findById(String id) {
        for (Employee e : employees) {
            if (e.getId().equals(id)) {
                return e;
            }
        }
        return null;
    }

    @Override
    public void update(Employee employee) {
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).getId().equals(employee.getId())){
                employees.set(i, employee);
                break;
            }
        }
    }
}
