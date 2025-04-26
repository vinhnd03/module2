package ss19_string_regex.thuc_hanh.kiem_tra_tai_khoan;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex = "^[a-z0-9_]{6,}$";
        String account = "vinh12";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(account);
        System.out.println(matcher.matches());
    }
}
