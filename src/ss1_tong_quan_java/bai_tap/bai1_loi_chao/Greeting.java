package ss1_tong_quan_java.bai_tap.bai1;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên bạn: ");
        String name = scanner.nextLine();
        System.out.println("Tên của bạn là: " + name);
    }
}
