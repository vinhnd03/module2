package ss5_modifier_static_package.bai_tap.product;

import ss3_mang.thuc_hanh.menu.StudentManagement;

import java.util.Scanner;

public class Menu {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        ProductManagement pm = new ProductManagement();
        int choice;
        do {
            System.out.println();
            System.out.println("============ [ MENU QL SẢN PHẨM ] =============");
            System.out.println("1. Hiển thị danh sách");
            System.out.println("2. Thêm sản phẩm");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Cập nhật sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm");
            System.out.println("6. Thoát");
            System.out.println("===============================================");
            System.out.print("Lựa chọn: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Danh sách");
                        pm.display();
                        pm.askForContinue();
                        break;
                    case 2:
                        System.out.println("Thêm mới");
                        pm.add();
                        pm.display();
                        pm.askForContinue();
                        break;
                    case 3:
                        System.out.println("Xóa theo id");
                        pm.delete();
                        pm.display();
                        pm.askForContinue();
                        break;

                    case 4:
                        System.out.println("Cập nhật theo id");
                        pm.update();
                        pm.display();
                        pm.askForContinue();
                        break;
                    case 5:
                        System.out.println("Tìm kiếm theo tên");
                        pm.search();
                        pm.askForContinue();
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
