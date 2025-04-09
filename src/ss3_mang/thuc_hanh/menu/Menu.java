package ss3_mang.thuc_hanh.menu;

import java.util.Scanner;

public class Menu {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println();
            System.out.println("================= [ MENU ] ==================");
            System.out.println("1. Display");
            System.out.println("2. Add");
            System.out.println("3. Delete");
            System.out.println("4. Update");
            System.out.println("5. Search");
            System.out.println("6. Exit");
            System.out.println("=============================================");
            System.out.print("Enter your choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        display();
                        break;
                    case 2:
                        add();
                        break;
                    case 3:
                        delete();
                        break;
                    case 4:
                        update();
                        break;
                    case 5:
                        search();
                        break;
                    case 6:
                        System.out.print("Press Y to confirm exit: ");
                        String exit = scanner.nextLine();
                        if (exit.toLowerCase().equals("y")) {
                            System.out.println("Goodbye!");
                            System.exit(0);
                        }
                    default:
                        System.out.println("No choice!");
                        break;
                }
            } catch (NumberFormatException message) {
                System.out.println("Vui lòng nhập số!");
                System.out.println("Lỗi: " + message.getMessage());
            }
            System.out.print("Do you want to continue? (y/n): ");

            do {
                String conti = scanner.nextLine();
                if (conti.toLowerCase().equals("y") || conti.equals("1")) {
                    break;
                } else if (conti.toLowerCase().equals("n") || conti.equals("0")) {
                    System.exit(0);
                } else {
                    System.out.print("Please enter y or n: ");
                }

            } while (true);

        } while (true);
    }

    public static void display() {
        System.out.println("Display");
    }

    public static void add() {
        System.out.println("Add");
    }

    public static void delete() {
        System.out.println("Delete");
    }

    public static void update() {
        System.out.println("Update");
    }

    public static void search() {
        System.out.println("Search");
    }

    public static void main(String[] args) {
        menu();
    }
}
