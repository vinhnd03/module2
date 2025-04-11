package ss3_mang.thuc_hanh.menu;

import java.util.Scanner;

public class Menu {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        StudentManagement studentManagement = new StudentManagement();
        int choice;
        do {
            System.out.println();
            System.out.println("================= [ MENU ] ==================");
            System.out.println("1. Display");
            System.out.println("2. Add");
            System.out.println("3. Delete");
            System.out.println("4. Update");
            System.out.println("5. Search");
            System.out.println("6. Exit");
            System.out.println("=============================================");
            System.out.print("Lựa chọn: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        studentManagement.display();
                        studentManagement.askForContinue();
                        break;
                    case 2:
                        studentManagement.add();
                        studentManagement.askForContinue();
                        break;
                    case 3:
                        studentManagement.delete();
                        studentManagement.askForContinue();
                        break;
                    case 4:
                        studentManagement.update();
                        studentManagement.askForContinue();
                        break;
                    case 5:
                        studentManagement.search();
                        studentManagement.askForContinue();
                        break;
                    case 6:
                        System.out.print("Nhập Y để xác nhận thoát: ");
                        String exit = scanner.nextLine();
                        if (exit.toLowerCase().equals("y")) {
                            System.out.println("Goodbye!");
                            System.exit(0);
                        }
                    default:
                        System.out.println("Lựa chọn không hợp lệ!");
                        break;
                }
            } catch (NumberFormatException message) {
                //System.out.println("Vui lòng nhập số!");
                System.out.println("Lỗi: " + message.getMessage());
                System.out.print("Enter để quay lại");
                scanner.nextLine();
            }


        } while (true);
    }

    public static void main(String[] args) {
        menu();
    }
}
