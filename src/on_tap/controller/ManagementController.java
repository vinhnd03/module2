package on_tap.controller;

import on_tap.entiry.Customer;
import on_tap.entiry.CustomerType;
import on_tap.service.ICustomerService;
import on_tap.service.ICustomerTypeService;
import on_tap.service.impl.CustomerService;
import on_tap.service.impl.CustomerTypeService;
import on_tap.view.CustomerView;

import java.util.List;
import java.util.Scanner;

public class ManagementController {
    private static Scanner scanner = new Scanner(System.in);
    private static ICustomerService customerService = new CustomerService();
    private static ICustomerTypeService customerTypeService = new CustomerTypeService();
    public static void displayMenu() {

        do{
            System.out.println("===Quản lý hóa đơn tiền điện===");
            System.out.println("1.  Thêm mới khách hàng");
            System.out.println("2.  Hiển thị thông tin khách hàng");
            System.out.println("3.  Tìm kiếm khách hàng");
            System.out.println("4.  Thoát ứng dụng");
            System.out.print("Lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("1.  Thêm mới khách hàng");
                    add();
                    break;
                case 2:
                    System.out.println("2.  Hiển thị thông tin khách hàng");
                    display();
                    break;
                case 3:
                    System.out.println("3.  Tìm kiếm khách hàng");
                    search();
                    break;
                case 4:
                    System.out.println("Chào tạm biệt");
                    System.exit(0);
                default:
                    System.out.println("Không hợp lệ");
                    break;
            }
        }while (true);
    }

    private static void search() {
        String name = CustomerView.enterName();
        List<Customer> customers = customerService.findByName(name);
        CustomerView.displayCustomerList(customers);
    }

    private static void display() {
        List<Customer> customers = customerService.findAll();
        CustomerView.displayCustomerList(customers);
    }

    private static void add(){
        boolean flag = true;
        do {
            System.out.println("===Thêm mới khách hàng===");
            System.out.println("1.  Thêm khách hàng Việt Nam");
            System.out.println("2.  Thêm khách hàng nước ngoài");
            System.out.println("3.  Thoát");
            System.out.print("Lụa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("1.  Thêm khách hàng Việt Nam");
                    addVietNamCustomer();
                    break;
                case 2:
                    System.out.println("2.  Thêm khách hàng nước ngoài");
                    addForeignCustomer();
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("Không hợp lệ.");
                    break;
            }
        }while (flag);
    }

    private static void addVietNamCustomer() {
        Customer customer = new CustomerView().inputVietNamCustomer();
        customerService.add(customer);
        System.out.println("Thêm mới thành công");
    }

    private static void addForeignCustomer() {
        Customer customer = new CustomerView().inputForeignCustomer();
        customerService.add(customer);
        System.out.println("Thêm mới thành công");
    }

    public static void displayCustomerType() {
        List<CustomerType> customerTypes = customerTypeService.findAll();
        CustomerView.displayCustomerTypeList(customerTypes);
    }

    public static boolean checkCustomerType(String type) {
        CustomerType customerType = customerTypeService.findById(type);
        if(customerType != null){
            return true;
        }
        return false;
    }

    public static String getCustomerTypeName(String id){
        CustomerType customerType = customerTypeService.findById(id);
        return customerType.getName();
    }
}
