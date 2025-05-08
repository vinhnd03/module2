package case_study.view;

import case_study.common.ValidateInput;
import case_study.entity.Customer;

import java.util.List;
import java.util.Scanner;

public class CustomerView {
    private static Scanner scanner = new Scanner(System.in);


    public static void displayList(List<Customer> customers) {
        System.out.printf("%-7s | %-20s | %-15s | %-20s | %-10s | %-15s | %-20s | %-10s | %-20s \n",
                "ID", "Họ và tên", "Ngày sinh", "CCCD", "Giới tính", "Điện thoại", "Email", "Hạng", "Địa chỉ");
        for (int i = 0; i < customers.size(); i++) {
            System.out.printf("%-7s | %-20s | %-15s | %-20s | %-10s | %-15s | %-20s | %-10s | %-20s \n",
                     customers.get(i).getId(), customers.get(i).getName(), customers.get(i).getBirthday(),
                    customers.get(i).getIdCard(), customers.get(i).isGender() ? "Nam" : "Nữ", customers.get(i).getPhone(),
                    customers.get(i).getEmail(), customers.get(i).getRank(), customers.get(i).getAddress());
        }
    }

    public static Customer inputNewCustomer() {
        String id = ValidateInput.inputCustomerId();
        String name = ValidateInput.inputName();
        String birthday = ValidateInput.inputDate("Ngày sinh");
        String idCard = ValidateInput.inputIdCard();
        boolean gender = ValidateInput.inputGender();
        String phone = ValidateInput.inputPhone();
        String email = ValidateInput.inputEmail();
        String type = ValidateInput.inputRank();
        System.out.print("Nhập địa chỉ: ");
        String address = scanner.nextLine();

        return new Customer(id, name, birthday, idCard, gender, phone, email, type, address);
    }

    public static String inputCustomerId() {
        System.out.println("Nhập id khách hàng cần sửa: ");
        return scanner.nextLine();
    }

    public static Customer editCustomer(Customer foundCustomer) {
        foundCustomer.setName(ValidateInput.inputName());
        foundCustomer.setBirthday(ValidateInput.inputDate("Ngày sinh"));
        foundCustomer.setIdCard(ValidateInput.inputIdCard());
        foundCustomer.setGender(ValidateInput.inputGender());
        foundCustomer.setPhone(ValidateInput.inputPhone());
        foundCustomer.setEmail(ValidateInput.inputEmail());;
        foundCustomer.setRank(ValidateInput.inputRank());
        System.out.print("Nhập địa chỉ: ");
        foundCustomer.setAddress(scanner.nextLine());
        return foundCustomer;
    }

    public static int selectRank() {
        System.out.println("Chọn thứ hạng: ");
        System.out.println("1. Thành viên");
        System.out.println("2. Bạc");
        System.out.println("3. Vàng");
        System.out.println("4. Bạch kim");
        System.out.println("5. Kim cương");
        System.out.print("Chọn: ");
        return Integer.parseInt(scanner.nextLine());
    }
}
