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
            System.out.println("==========[Customer]=========");
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");
            System.out.println("=============================");
            System.out.print("Your choice: ");
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
                    System.out.println("3. Edit customer");
                    break;
                case 4:
                    loop = false;
                    break;
                default:
                    System.out.println("Invalid");
            }

        } while (loop);
    }
}
