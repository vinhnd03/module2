package case_study.view;

import case_study.common.ValidateInput;
import case_study.entity.Contract;

import java.util.Scanner;
import java.util.Set;

public class ContractView {
    private static Scanner scanner = new Scanner(System.in);

    public static Contract inputContractInfo(String bookingId) {
        int number = ValidateInput.inputContractNumber();
        System.out.print("Nhập số tiền cọc: ");
        long deposit = Long.parseLong(scanner.nextLine());
        System.out.print("Nhập tổng số tiền: ");
        long total = Long.parseLong(scanner.nextLine());
        return new Contract(number, bookingId, deposit, total);
    }

    public static void displayContractList(Set<Contract> contractSet) {
        System.out.printf("%-15s | %-15s | %-15s | %-15s \n", "Số hợp đồng", "ID booking", "Tiền cọc", "Tiền thanh toán");
        for (Contract c : contractSet){
            System.out.printf("%-15d | %-15s | %-15d | %-15d \n", c.getContractNumber(), c.getBookingId(),
                    c.getDeposit(), c.getTotal());
        }
    }

    public static int inputContractNumber() {
        System.out.print("Nhập số hợp đồng: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public static Contract editContract(Contract contract) {
        System.out.print("Nhập số tiền cọc: ");
        contract.setDeposit(Long.parseLong(scanner.nextLine()));
        System.out.print("Nhập tổng số tiền: ");
        contract.setTotal(Long.parseLong(scanner.nextLine()));
        return contract;
    }
}
