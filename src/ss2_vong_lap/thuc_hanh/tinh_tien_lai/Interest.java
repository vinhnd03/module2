package ss2_vong_lap.thuc_hanh.tinh_tien_lai;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        double money = 0.0;
        int month = 0;
        double interestRate = 0.0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter investment among: ");
        money = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter number of months: ");
        month = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter annual interest rate in percentage: ");
        interestRate = Double.parseDouble(scanner.nextLine());

        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;
        }

        System.out.println("Total of interest: " + totalInterest);
    }
}
