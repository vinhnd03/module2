package case_study.repository.impl;

import case_study.entity.Employee;
import case_study.repository.IEmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static List<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee("NV00023", "Nguyen Duc Vinh", "12-05-2003", "10111011101",
                true, "0123456789", "ducvinh@gmail.com", "Quản lý", "Cao đẳng", 1000000));
        employees.add(new Employee("NV00024", "Nguyen Duc Vinh", "12-05-2003", "10111011101",
                true, "0123456789", "ducvinh@gmail.com", "Nhân viên", "Cao đẳng", 1000000));
    }


    @Override
    public List<Employee> findAll() {
        return employees;
    }
}
