package case_study.controllers;

import java.util.Scanner;

public class FuramaController {

    private void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("================== [ FURAMA ] ==================");
            System.out.println("1.  Employee Management.");
            System.out.println("2.  Customer Management.");
            System.out.println("3.  Facility Management.");
            System.out.println("4.  Booking Management.");
            System.out.println("5.  Promotion Management.");
            System.out.println("6.  Employee Management.");
            System.out.println("================================================");
            System.out.print("Your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    employeeManagement(scanner);
                    break;
                case 2:
                    customerManagement(scanner);
                    break;
                case 3:

                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("i");

            }
        } while (true);
    }

    void employeeManagement(Scanner scanner) {
        boolean loop = true;
        do {
            System.out.println("==========[Employee]=========");
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");
            System.out.println("=============================");
            System.out.print("Your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Display list employees");
                    break;
                case 2:
                    System.out.println("2. Add new employee");
                    break;
                case 3:
                    System.out.println("3. Edit employee");
                    break;
                case 4:
                    loop = false;
                    break;
                default:
                    System.out.println("Invalid");
            }

        } while (loop);
    }
    void customerManagement(Scanner scanner) {
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
                    System.out.println("1. Display list customers");
                    break;
                case 2:
                    System.out.println("2. Add new customer");
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
    void facilityManagement(Scanner scanner) {
        boolean loop = true;
        do {
            System.out.println("==========[Facility]=========");
            System.out.println("1. Display list facilities");
            System.out.println("2. Add new facility");
            System.out.println("3. Edit facility");
            System.out.println("4. Return main menu");
            System.out.println("=============================");
            System.out.print("Your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("1. Display list facilities");
                    break;
                case 2:
                    System.out.println("2. Add new facility");
                    break;
                case 3:
                    System.out.println("3. Edit facility");
                    break;
                case 4:
                    loop = false;
                    break;
                default:
                    System.out.println("Invalid");
            }

        } while (loop);
    }

    public static void main(String[] args) {
         FuramaController controller = new FuramaController();
         controller.displayMainMenu();
    }


}
