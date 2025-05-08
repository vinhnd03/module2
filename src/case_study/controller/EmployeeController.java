package case_study.controller;

import case_study.common.ValidateInput;
import case_study.entity.Employee;
import case_study.service.impl.EmployeeService;
import case_study.view.EmployeeView;

import java.util.List;
import java.util.Scanner;

public class EmployeeController {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeService employeeService = new EmployeeService();

    public static void employeeMenu() {
        boolean loop = true;
        do {
            System.out.println("==========[Nhân viên]=========");
            System.out.println("1. Danh sách nhân viên");
            System.out.println("2. Thêm mới nhân viên");
            System.out.println("3. Chỉnh sửa nhân viên");
            System.out.println("4. Trở về menu chính");
            System.out.println("==============================");
            System.out.print("Lựa chọn: ");
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        List<Employee> employees = employeeService.findAll();
                        EmployeeView.dislayList(employees);
                        break;
                    case 2:
                        Employee employee = EmployeeView.inputNewEmployee();
                        employeeService.add(employee);
                        break;
                    case 3:
                        String id = EmployeeView.inputEmployeeId();
                        Employee foundEmployee = employeeService.findById(id);
                        if (foundEmployee == null) {
                            System.out.println("Nhân viên không tồn tại");
                        } else {
                            Employee editedEmployee = EmployeeView.editEmployee(foundEmployee);
                            employeeService.update(editedEmployee);
                        }
                        break;
                    case 4:
                        loop = false;
                        break;
                    default:
                        System.out.println("Không hợp lệ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập đúng định dạng số");
            }
        } while (loop);
    }
}
