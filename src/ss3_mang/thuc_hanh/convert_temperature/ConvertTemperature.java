package ss3_mang.thuc_hanh.convert_temperature;

import java.util.Scanner;

public class ConvertTemperature {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n===[Temperature Converter]===");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            System.out.println("=============================");
            switch (choice) {
                case 1:
                    System.out.print("Enter Celsius: ");
                    double celsius = Double.parseDouble(scanner.nextLine());
                    System.out.print("Fahrenheit: " + String.format("%.2f", celsiusToFahrenheit(celsius)));
                    break;
                case 2:
                    System.out.print("Enter Fahrenheit: ");
                    double fahrenheit = Double.parseDouble(scanner.nextLine());
                    System.out.print("Celsius: " + String.format("%.2f", fahrenheitToCelsius(fahrenheit)));
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No Choice!");
                    break;
            }
        } while (true);
    }
}
