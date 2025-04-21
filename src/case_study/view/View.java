package case_study.view;

import case_study.controller.FuramaController;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        FuramaController.displayMainMenu();
    }

    private static Scanner scanner = new Scanner(System.in);

    public static void promotionMenu() {
        boolean loop = true;
        do {
            System.out.println("==========[Promotion]=========");
            System.out.println("1. Display list customer user service");
            System.out.println("2. Display list customer get voucher");
            System.out.println("3. Return main menu");
            System.out.println("==============================");
            System.out.print("Your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("1. Display list customer user service");
                    break;
                case 2:
                    System.out.println("2. Display list customer get voucher");
                    break;
                case 3:
                    loop = false;
                    break;
                default:
                    System.out.println("Invalid");
            }

        } while (loop);
    }
}
