package case_study.controller;

import case_study.entity.Customer;
import case_study.service.impl.CustomerService;
import case_study.view.CustomerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerController {
    private static Scanner scanner = new Scanner(System.in);
    private static CustomerService customerService = new CustomerService();

    public static void customerMenu() {
        boolean loop = true;
        do {
            System.out.println("==========[Khách hàng]=========");
            System.out.println("1. Danh sách khách hàng");
            System.out.println("2. Thêm khách hàng mới");
            System.out.println("3. Chỉnh sửa khách hàng");
            System.out.println("4. Trờ về menu chính");
            System.out.println("===============================");
            System.out.print("Lựa chọn: ");
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        List<Customer> customers = customerService.findAll();
                        CustomerView.displayList(customers);
                        break;
                    case 2:
                        Customer customer = CustomerView.inputNewCustomer();
                        customerService.add(customer);
                        break;
                    case 3:
                        String customerId = CustomerView.inputCustomerId();
                        Customer foundCustomer = customerService.findById(customerId);
                        if(foundCustomer != null){
                            Customer editedCustomer = CustomerView.editCustomer(foundCustomer);
                            customerService.update(editedCustomer);
                        }else{
                            System.out.println("Không tìm thấy khách hàng có id là: " + customerId);
                        }
                        break;
                    case 4:
                        loop = false;
                        break;
                    default:
                        System.out.println("Không hợp lệ");
                }
            }catch (NumberFormatException e){
                System.out.println("Sai định dạng số");
            }
        } while (loop);
    }
}
