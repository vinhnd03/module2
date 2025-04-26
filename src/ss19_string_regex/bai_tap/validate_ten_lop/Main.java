package ss19_string_regex.bai_tap.validate_ten_lop;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "^[CAP][0-9]{4}[GHIK]$";
        System.out.print("Nhập tên lớp: ");
        String className = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(className);
        System.out.println((matcher.matches()) ? "Đúng định dạng" : "Sai định dạng");

    }
}
