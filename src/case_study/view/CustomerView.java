package case_study.view;

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
}
