package case_study.view;

import case_study.entity.Contract;

import java.util.Scanner;

public class ContractView {
    private static Scanner scanner = new Scanner(System.in);

    public static Contract inputContractInfo(String bookingId) {
        System.out.print("Nhập số hợp đồng: ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số tiền cọc: ");
        long deposit = Long.parseLong(scanner.nextLine());
        System.out.print("Nhập tổng số tiền: ");
        long total = Long.parseLong(scanner.nextLine());
        return new Contract(number, bookingId, deposit, total);
    }
}
