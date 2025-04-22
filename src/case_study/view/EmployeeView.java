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

    public static Employee addNewEmployee() {
        String id = ValidateInput.inputEmployeeId();

        String name = ValidateInput.inputName();

        String birthday = ValidateInput.inputDate("ngày sinh");

        System.out.println("Nhập số căn cước: ");
        String idCard = scanner.nextLine();
        System.out.println("Chọn giới tính (Nam: 1 || Nữ: 0): ");
        String gender = scanner.nextLine();
        System.out.println("Nhập số điện thoại: ");
        String phone = scanner.nextLine();
        System.out.println("Bằng cấp: ");
        String qualification = scanner.nextLine();
        System.out.println("Vị trí: ");
        String position = scanner.nextLine();
        System.out.println("Lương: ");
        long salary = Long.parseLong(scanner.nextLine());

        return new Employee();
    }
}
