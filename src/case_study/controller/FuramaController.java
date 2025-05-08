package case_study.controller;

import case_study.view.*;

import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);

    public static int displayMainMenu() {
        do {
            System.out.println("================== [ FURAMA ] ==================");
            System.out.println("1.  Quản lý nhân viên.");
            System.out.println("2.  Quản lý khách hàng.");
            System.out.println("3.  Quản lý dịch vụ.");
            System.out.println("4.  Quản lý booking.");
            System.out.println("5.  Quản lý khuyến mãi.");
            System.out.println("6.  Thoát");
            System.out.println("================================================");
            System.out.print("Lựa chọn: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        EmployeeController.employeeMenu();
                        break;
                    case 2:
                        CustomerController.customerMenu();
                        break;
                    case 3:
                        FacilityController.facilityMenu();
                        break;
                    case 4:
                        BookingController.bookingMenu();
                        break;
                    case 5:
                        PromotionController.promotionMenu();
                        break;
                    case 6:
                        System.out.println("Chào tạm biệt");
                        System.exit(0);
                    default:
                        System.out.println("Không hợp lệ");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Sai định dạng số");
                e.printStackTrace();
            }


        } while (true);
    }
}
