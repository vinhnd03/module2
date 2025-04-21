package case_study.view;

import java.util.Scanner;

public class EmployeeView {
    private static Scanner scanner = new Scanner(System.in);

    public static void employeeMenu() {
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
}
