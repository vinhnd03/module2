package case_study.view;

import case_study.common.ValidateInput;
import case_study.entity.Employee;

import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    private static Scanner scanner = new Scanner(System.in);

    public static void dislayList(List<Employee> employees) {
        System.out.printf("%-7s | %-20s | %-15s | %-15s | %-10s | %-15s | %-20s | %-20s | %-10s | %-15s \n",
                "ID", "Họ và tên", "Ngày sinh", "CCCD", "Giới tính", "Điện thoại", "Email", "Bằng cấp", "Vị trí", "Lương");
        for (Employee e : employees) {
            System.out.printf("%-7s | %-20s | %-15s | %-15s | %-10s | %-15s | %-20s | %-20s | %-10s | %-15d \n",
                    e.getId(), e.getName(), e.getBirthday(), e.getIdCard(), e.isGender() ? "Nam" : "Nữ",
                    e.getPhone(), e.getEmail(), e.getQualification(), e.getPosition(), e.getSalary());
        }
    }

    public static Employee inputNewEmployee() {
        String id = ValidateInput.inputEmployeeId();
        String name = ValidateInput.inputName();
        String birthday = ValidateInput.inputEmployeeDate();
        String idCard = ValidateInput.inputIdCard();
        boolean gender = ValidateInput.inputGender();
        String phone = ValidateInput.inputPhone();
        String email = ValidateInput.inputEmail();
        String qualification = ValidateInput.inputQualification();
        String position = ValidateInput.inputPosition();
        long salary = ValidateInput.inputSalary();
        return new Employee(id, name, birthday, idCard, gender,phone, email, qualification, position, salary);
    }

    public static Employee editEmployee(Employee employee) {
        employee.setName(ValidateInput.inputName());
        employee.setBirthday(ValidateInput.inputEmployeeDate());
        employee.setIdCard(ValidateInput.inputIdCard());
        employee.setGender(ValidateInput.inputGender());
        employee.setPhone(ValidateInput.inputPhone());
        employee.setEmail(ValidateInput.inputEmail());
        employee.setQualification(ValidateInput.inputQualification());
        employee.setPosition(ValidateInput.inputPosition());
        employee.setSalary(ValidateInput.inputSalary());
        return employee;
    }

    public static String inputEmployeeId() {
        System.out.println("Nhập id nhân viên cần sửa: ");
        return scanner.nextLine();
    }

    public static int selectPosition() {
        System.out.println("Chọn vị trí nhân viên: ");
        System.out.println("1. Lễ tân");
        System.out.println("2. Phục vụ");
        System.out.println("3. Chuyên viên");
        System.out.println("4. Giám sát");
        System.out.println("5. Quản lý");
        System.out.println("6. Giám đốc");
        System.out.print("Chọn: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public static int selectQualification() {
        System.out.println("Chọn trình độ nhân viên: ");
        System.out.println("1. Trung học");
        System.out.println("2. Cao đẳng");
        System.out.println("3. Đại học");
        System.out.println("4. Sau đại học");
        System.out.print("Chọn: ");
        return Integer.parseInt(scanner.nextLine());
    }
}