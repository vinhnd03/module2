package case_study.view;

import case_study.common.ValidateInput;
import case_study.entity.Employee;

import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    private static Scanner scanner = new Scanner(System.in);

    public static void dislayList(List<Employee> employees) {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }
    }

    public static Employee inputNewEmployee() {
        String id = ValidateInput.inputEmployeeId();

        String name = ValidateInput.inputName();

        String birthday = ValidateInput.inputDate("ngày sinh");

        String idCard = ValidateInput.inputIdCard();

        boolean gender = ValidateInput.inputGender();

        String phone = ValidateInput.inputPhone();

        String email = ValidateInput.inputEmail();

        System.out.print("Bằng cấp: ");
        String qualification = scanner.nextLine();
        System.out.print("Vị trí: ");
        String position = scanner.nextLine();

        long salary = ValidateInput.inputSalary();

        return new Employee(id, name, birthday, idCard, gender,phone, email, qualification, position, salary);
    }

    public static Employee editEmployee(Employee employee) {
        employee.setName(ValidateInput.inputName());
        employee.setBirthday(ValidateInput.inputDate("ngày sinh"));
        employee.setIdCard(ValidateInput.inputIdCard());
        employee.setGender(ValidateInput.inputGender());
        employee.setPhone(ValidateInput.inputPhone());
        employee.setEmail(ValidateInput.inputEmail());
        System.out.print("Nhập bằng cấp: ");
        employee.setQualification(scanner.nextLine());
        System.out.print("Nhập vị ví: ");
        employee.setPosition(scanner.nextLine());
        employee.setSalary(ValidateInput.inputSalary());
        return employee;
    }
}
