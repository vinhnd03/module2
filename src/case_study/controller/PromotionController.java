package case_study.controller;

import case_study.common.ValidateInput;
import case_study.entity.Customer;
import case_study.service.ICustomerService;
import case_study.service.IPromotionService;
import case_study.service.impl.CustomerService;
import case_study.service.impl.PromotionService;
import case_study.view.PromotionView;
import com.sun.source.tree.Tree;

import java.util.*;

public class PromotionController {
    private static IPromotionService promotionService = new PromotionService();
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
                    displayCustomersUseService();
                    break;
                case 2:
                    System.out.println("2. Danh sách khách hàng nhận voucher");
                    displayCustomerGetVoucher();
                    break;
                case 3:
                    loop = false;
                    break;
                default:
                    System.out.println("Không hợp lệ");
            }
        } while (loop);
    }

    private static void displayCustomersUseService(){
        String year = PromotionView.inputYear();
        Set<Customer> customers = promotionService.findCustomerUseServiceByYear(year);
        PromotionView.displayCustomersUseService(customers);
    }

    private static void displayCustomerGetVoucher(){
        int voucher10 = PromotionView.inputVoucher10();
        int voucher20 = PromotionView.inputVoucher20();
        int voucher50 = PromotionView.inputVoucher50();

        Map<Customer, Integer> customersGetVoucher = promotionService.distributeVoucher(voucher10, voucher20, voucher50);
        PromotionView.displayCustomerGetVoucher(customersGetVoucher);
    }
}
