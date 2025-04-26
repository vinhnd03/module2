package ss19_string_regex.thuc_hanh;

public class kiem_ten {
    public static void main(String[] args) {
        String name = "Nguyen Duc Vinh";
        String regex = "^([A-Z][a-z]*)\\s([A-Z][a-z]*\\s)*([A-Z][a-z]*)$";
        boolean check = name.matches(regex);
    }
}
