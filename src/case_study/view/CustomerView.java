package case_study.view;

import case_study.common.ValidateInput;
import case_study.entity.Customer;

import java.util.List;
import java.util.Scanner;

public class CustomerView {
    private static Scanner scanner = new Scanner(System.in);


    public static void displayList(List<Customer> customers) {
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i));
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
        System.out.print("Nhập hạng: ");
        String type = scanner.nextLine();
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
        System.out.print("Nhập hạng: ");
        foundCustomer.setRank(scanner.nextLine());
        System.out.print("Nhập địa chỉ: ");
        foundCustomer.setAddress(scanner.nextLine());
        return foundCustomer;
    }
}
