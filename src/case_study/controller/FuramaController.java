package case_study.controller;

import case_study.view.*;

import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);

    public static int displayMainMenu() {
        do {
            System.out.println("================== [ FURAMA ] ==================");
            System.out.println("1.  Employee Management.");
            System.out.println("2.  Customer Management.");
            System.out.println("3.  Facility Management.");
            System.out.println("4.  Booking Management.");
            System.out.println("5.  Promotion Management.");
            System.out.println("6.  Exit");
            System.out.println("================================================");
            System.out.print("Your choice: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        EmployeeController.employeeMenu();
                        break;
                    case 2:
                        CustomerController.customerMenu();
                        break;
                    case 3:
                        FacilityController.facilityMenu();
                        break;
                    case 4:
                        BookingView.bookingMenu();
                        break;
                    case 5:
                        View.promotionMenu();
                        break;
                    case 6:
                        System.out.println("Goodbye");
                        System.exit(0);
                    default:
                        System.out.println("Invalid");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format");
            }


        } while (true);
    }
}
