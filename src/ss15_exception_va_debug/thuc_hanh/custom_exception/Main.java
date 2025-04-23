package ss15_exception_va_debug.thuc_hanh.custom_exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = -1;
        boolean loop = true;
        while (loop){
            try {
                System.out.print("Nhập tuổi của bạn: ");
                age =  Integer.parseInt(scanner.nextLine());
                enterAge(age);
                loop = false;
            }catch (AgeCustomException e){
                System.out.println("Lỗi: " + e.getMessage());
                System.out.println("Nhập lại");
            }
        }
        System.out.println("Tuổi đã nhập: " + age);
    }

    public static void enterAge(int age) throws AgeCustomException {
        if(age < 18){
            throw new AgeCustomException("Tuổi phải lớn hơn 18");
        }
    }
}
