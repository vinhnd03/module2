package ss11_stack_va_queue.bai_tap.chuyen_doi_thap_phan_sang_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    private static void convert() {
        Stack<Integer> nums = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thập phân: ");
        int num = Integer.parseInt(scanner.nextLine());
        while (num != 0) {
            nums.push(num % 2);
            num /= 2;
        }

        System.out.print("Chuyển đổi: ");
        while (nums.size() > 0) {
            System.out.printf("%-3d", nums.pop());
        }
    }

    public static void main(String[] args) {
        convert();
    }
}
