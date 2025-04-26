package ss19_string_regex.thuc_hanh.Kiem_tra_bien_so_xe;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static void xeMay(){
        System.out.print("Nhập biển số xe máy: ");
        String bienSo;
        //String regex = "([0-9]{2}-[A-Za-z][A-Za-z0-9])\\s([0-9]{3}\\.[0-9]{2}|[0-9]{4})$";
//        String regex = "[0-9]{2}[A-Za-z]\\s[0-9]{3}\\.[0-9]{2}";
        String regex = "[0-9]{2}-[A-Za-z]\\s[0-9]{3}\\.[0-9]{2}$";
        Pattern pattern = Pattern.compile(regex);
        do {
            bienSo = scanner.nextLine();
            Matcher matcher = pattern.matcher(bienSo);
            if(matcher.matches()){
                System.out.println("Đúng rồi");
                System.exit(0);
            }else{
                System.out.println("Sai rồi. Mời nhập lại");
            }
        }while (true);
    }

    public static void main(String[] args) {
        xeMay();
    }
}
