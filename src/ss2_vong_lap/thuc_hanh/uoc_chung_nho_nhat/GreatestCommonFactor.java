package ss2_vong_lap.thuc_hanh.uoc_chung_nho_nhat;

import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter b: ");
        b = Integer.parseInt(scanner.nextLine());

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }

        if (a != b) {
            if (a > b) {
                a = a - b;
                System.out.println("Greatest common factor: " + a);
            } else {
                b = b - a;
                System.out.println("Greatest common factor: " + b);
            }
        } else {
            System.out.println("Greatest common factor: " + a);
        }
    }
}
