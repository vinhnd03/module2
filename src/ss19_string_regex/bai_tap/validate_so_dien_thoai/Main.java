package ss19_string_regex.bai_tap.validate_so_dien_thoai;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "^(\\([0-9]{2}\\))-\\(0[0-9]{9}\\)$";
        System.out.print("Nhập số điện thoại: ");
        String phone = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);
        System.out.println((matcher.matches()) ? "Đúng định dạng" : "Sai định dạng");
    }
}
