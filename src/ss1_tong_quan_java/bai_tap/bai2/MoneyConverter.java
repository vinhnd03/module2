package ss1_tong_quan_java.bai_tap.bai2;

import java.util.Scanner;

public class MoneyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. USD qua VND.\n2. VND qua USD.\nChọn mệnh giá bạn muốn đổi: ");
        int chon = Integer.parseInt(scanner.nextLine());
        float tiGia = 24000;
        if (chon == 1) {
            System.out.print("Nhập USD: ");
            float usd = Float.parseFloat(scanner.nextLine());
            float vnd = usd * tiGia;
            System.out.print("VND: " + (String.format("%.2f", vnd)));
        } else if (chon == 2) {
            System.out.print("Nhập VND: ");
            float vnd = Float.parseFloat(scanner.nextLine());
            float usd = vnd / tiGia;
            System.out.printf("USD: %.2f", usd);
        } else {
            System.out.println("Lựa chọn không hợp lệ!");
        }
    }
}
