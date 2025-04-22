package case_study.common;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateInput {
    private static Scanner scanner = new Scanner(System.in);

    public static String inputName(){
        String regex = "^([A-Z][a-z]+)(\\s[A-Z][a-z]+)*$";
        Pattern pattern = Pattern.compile(regex);
        String name;
        do{
            System.out.print("Nhập tên nhân viên: ");
            name = scanner.nextLine().trim();
            Matcher matcher = pattern.matcher(name);

            if(matcher.matches()){
                return name;
            }else{
                System.out.println("Không hợp lệ.");
            }
        }while (true);
    }

    public static String inputEmployeeId(){
        String id;
        String regex = "NV-[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
        do{
            System.out.print("Nhập id nhân viên: ");
            id = scanner.nextLine().trim();
            Matcher matcher = pattern.matcher(id);

            if(matcher.matches()){
                return id;
            }else{
                System.out.println("Không hợp lệ.");
            }
        }while (true);
    }



    public static String inputDate(String type){
        String date;
        String regex = "\\d{2}-\\d{2}-\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        do{
            System.out.print("Nhập " + type + ": ");
            date = scanner.nextLine().trim();
            Matcher matcher = pattern.matcher(date);
            if(matcher.matches() && isValidDate(date)){
                return date;
            }else{
                System.out.println("Không hợp lệ");
            }
        }while (true);
    }

    public static String inputIdCard(){
        String idCard;
        String regex = "\\d{9}(\\d{3})?$";
        Pattern pattern = Pattern.compile(regex);

        do{
            System.out.print("Nhập CMND: ");
            idCard = scanner.nextLine().trim();
            Matcher matcher = pattern.matcher(idCard);
            if(matcher.matches()){
                return idCard;
            }
        }while (true);
    }

    public static String inputPhone(){
        String phone;
        String regex = "0\\d{9}$";
        Pattern pattern = Pattern.compile(regex);
        do{
            System.out.print("Nhập số điện thoại: ");
            phone = scanner.nextLine();
            Matcher matcher = pattern.matcher(phone);
            if(matcher.matches()){
                return phone;
            }
        }while (true);
    }



    private static boolean isValidDate(String dateStr){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try{
            LocalDate.parse(dateStr, formatter);
            return true;
        }catch (DateTimeException e){
            return false;
        }
    }
}
