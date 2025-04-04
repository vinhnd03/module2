package ss1_tong_quan_java.bai_tap.bai2_chuyen_doi_tien;

import java.util.Scanner;

public class MoneyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chon = 0;
        do{
            System.out.print("1. USD qua VND.\n2. VND qua USD.\nChọn mệnh giá bạn muốn đổi: ");
             chon = Integer.parseInt(scanner.nextLine());
        }while (chon != 1 && chon != 2);
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
