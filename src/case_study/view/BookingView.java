package case_study.view;

import java.util.Scanner;

public class BookingView {
    private static Scanner scanner = new Scanner(System.in);

    public static void bookingMenu() {
        boolean loop = true;
        do {
            System.out.println("===========[Booking]==========");
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new contract");
            System.out.println("4. Display list contract");
            System.out.println("5. Edit contract");
            System.out.println("6. Return main menu");
            System.out.println("==============================");
            System.out.print("Your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("1. Add new booking");
                    break;
                case 2:
                    System.out.println("2. Display list booking");
                    break;
                case 3:
                    System.out.println("3. Create new contract");
                    break;
                case 4:
                    System.out.println("4. Display list contract");
                    break;
                case 5:
                    System.out.println("5. Edit contract");
                    break;
                case 6:
                    loop = false;
                    break;
                default:
                    System.out.println("Invalid");
            }

        } while (loop);
    }
}
