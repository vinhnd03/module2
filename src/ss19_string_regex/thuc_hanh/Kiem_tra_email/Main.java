package ss19_string_regex.thuc_hanh.Kiem_tra_email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static Pattern pattern;
    private static Matcher matcher;

    private static final String EMAIL_REGEX =   "^[a-zA-z0-9]+[a-zA-Z0-9_.+-]*@[a-zA-z0-9_-]+(\\.[a-zA-z]{2,})$";
    //"^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public static boolean validate(String regex) {
        pattern = Pattern.compile(EMAIL_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(validate("duc+inh@gmail1.com"));
    }
}
