package case_study.controller;

import java.util.Scanner;

public class PromotionController {
    public static void promotionMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        do {
            System.out.println("===============[Khuyến mãi]==============");
            System.out.println("1. Danh sách khách hàng sử dụng dịch vụ");
            System.out.println("2. Danh sách khách hàng nhận voucher");
            System.out.println("3. Trờ về menu chính");
            System.out.println("=========================================");
            System.out.print("Lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("1. Danh sách khách hàng sử dụng dịch vụ");
                    break;
                case 2:
                    System.out.println("2. Danh sách khách hàng nhận voucher");
                    break;
                case 3:
                    loop = false;
                    break;
                default:
                    System.out.println("Không hợp lệ");
            }
        } while (loop);
    }
}
