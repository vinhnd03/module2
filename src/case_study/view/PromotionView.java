package case_study.view;

import case_study.entity.Customer;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class PromotionView {
    private static Scanner scanner = new Scanner(System.in);

    public static String inputYear() {
        System.out.print("Nhập năm cần lấy dữ liệu: ");
        return scanner.nextLine();
    }

    public static void displayCustomersUseService(Set<Customer> customers) {
        if(customers.size() > 0){
            System.out.printf("%-7s | %-20s | %-15s | %-20s | %-10s | %-15s | %-20s | %-10s | %-20s \n",
                    "ID", "Họ và tên", "Ngày sinh", "CCCD", "Giới tính", "Điện thoại", "Email", "Hạng", "Địa chỉ");
            for (Customer c : customers) {
                System.out.printf("%-7s | %-20s | %-15s | %-20s | %-10s | %-15s | %-20s | %-10s | %-20s \n",
                        c.getId(), c.getName(), c.getBirthday(), c.getIdCard(), c.isGender() ? "Nam" : "Nữ",
                        c.getPhone(), c.getEmail(), c.getRank(), c.getAddress());
            }
        }else{
            System.out.println("Danh sách trống");
        }

    }

    public static int inputVoucher10() {
        System.out.print("Nhập số lượng voucher 10%: ");
        return Integer.parseInt(scanner.nextLine());
    } public static int inputVoucher20() {
        System.out.print("Nhập số lượng voucher 20%: ");
        return Integer.parseInt(scanner.nextLine());
    } public static int inputVoucher50() {
        System.out.print("Nhập số lượng voucher 50%: ");
        return Integer.parseInt(scanner.nextLine());
    }

//    public static void displayCustomerStack(Stack<Customer> customers) {
//        while (customers.size() > 0){
//            System.out.println(customers.pop());
//        }
//    }

    public static void displayCustomerGetVoucher(Map<Customer, Integer> customersGetVoucher) {
        System.out.printf("%-7s | %-20s | %-15s | %-15s | %-10s | %-15s\n",
                "ID", "Họ và tên", "Ngày sinh", "CCCD", "Giới tính", "Voucher");
        for (Map.Entry<Customer, Integer> entry : customersGetVoucher.entrySet()){
            Customer c = entry.getKey();
            if(entry.getValue() == 1){
                System.out.printf("%-7s | %-20s | %-15s | %-15s | %-10s | %-15s\n",
                        c.getId(), c.getName(), c.getBirthday(), c.getIdCard(), c.isGender() ? "Nam" : "Nữ", "Giảm 10%");
            }else if(entry.getValue() == 2){
                System.out.printf("%-7s | %-20s | %-15s | %-15s | %-10s | %-15s\n",
                        c.getId(), c.getName(), c.getBirthday(), c.getIdCard(), c.isGender() ? "Nam" : "Nữ", "Giảm 20%");
            }else if(entry.getValue() == 3){
                System.out.printf("%-7s | %-20s | %-15s | %-15s | %-10s | %-15s\n",
                        c.getId(), c.getName(), c.getBirthday(), c.getIdCard(), c.isGender() ? "Nam" : "Nữ", "Giảm 50%");
            }
//System.out.println(entry.getKey() + "," + entry.getValue());
        }
    }
}
