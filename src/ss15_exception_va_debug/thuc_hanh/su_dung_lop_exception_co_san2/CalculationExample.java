package ss15_exception_va_debug.thuc_hanh.su_dung_lop_exception_co_san2;

import java.util.Scanner;
import java.util.concurrent.CancellationException;

public class CalculationExample {
    private void calculate(int x, int y){
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng của x và y là: " + a);
            System.out.println("Hiệu của x và y là: " + b);
            System.out.println("Tích của x và y là: " + c);
            System.out.println("Thương của x và y là: " + d);
        }catch (Exception e){
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập x: ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập y: ");
        int y = Integer.parseInt(scanner.nextLine());

        CalculationExample example = new CalculationExample();
        example.calculate(x, y);
    }
}
