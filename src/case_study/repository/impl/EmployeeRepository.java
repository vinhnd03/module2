package case_study.repository.impl;

import case_study.common.ReadAndWriteFile;
import case_study.entity.Employee;
import case_study.repository.IEmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static final String PATH = "src/case_study/data/employee.csv";

    private List<String> toStringList(List<Employee> employees){
        List<String> stringList = new ArrayList<>();
        for (Employee e: employees){
            stringList.add(e.infoToCSVFile());
        }
        return stringList;
    }
    @Override
    public List<Employee> findAll() {
        List<Employee> employees = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFileCSV(PATH);
        for (String s : stringList){
            String[] arr = s.split("\\s*,\\s*");
            employees.add(new Employee(arr[0], arr[1], arr[2], arr[3], Boolean.parseBoolean(arr[4]), arr[5],
                    arr[6], arr[7], arr[8], Long.parseLong(arr[9])));
        }
        return employees;
    }

    @Override
    public void add(Employee employee) {
        List<String> stringList = new ArrayList<>();
        stringList.add(employee.infoToCSVFile());
        ReadAndWriteFile.writeFileCSV(PATH, stringList, true);
    }

    @Override
    public Employee findById(String id) {
        List<Employee> employees = findAll();
        for (Employee e : employees) {
            if (e.getId().equals(id)) {
                return e;
            }
        }
        return null;
    }

    @Override
    public void update(Employee employee) {
        List<Employee> employees = findAll();
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).getId().equals(employee.getId())){
                employees.set(i, employee);
                break;
            }
        }
        List<String> stringList = toStringList(employees);
        ReadAndWriteFile.writeFileCSV(PATH, stringList, false);
    }
}
