package ss15_exception_va_debug.bai_tap.lop_exception_tam_giac;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0, c = 0;
//        boolean loop = true;
//        while (loop)
//            try {
//                System.out.print("Nhập cạnh a: ");
//                a = Integer.parseInt(scanner.nextLine());
//                System.out.print("Nhập cạnh b: ");
//                b = Integer.parseInt(scanner.nextLine());
//                System.out.print("Nhập cạnh c: ");
//                c = Integer.parseInt(scanner.nextLine());
//                checkTriangle(a, b, c);
//                loop = false;
//            } catch (IllegalTriangleException e) {
//                System.out.println(e.getMessage());
//                System.out.println("Nhập lại");
//            } catch (NumberFormatException e){
//                System.out.println("Không đúng định dạng số");
//                System.out.println("Nhập lại");
//            } catch (Exception e){
//                e.printStackTrace();
//            }

        System.out.print("Nhập cạnh a: ");
        a = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập cạnh b: ");
        b = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập cạnh c: ");
        c = Integer.parseInt(scanner.nextLine());

        try {
            Triangle triangle = new Triangle(a, b, c);
            System.out.println("Tam giác của bạn có cạnh lần lượt là: " + triangle.getA() + ", " + triangle.getB() + ", " + triangle.getC());

        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }


    }

//    private static void checkTriangle(int a, int b, int c) throws IllegalTriangleException {
//        if (a < 1 || b < 1 || c < 1 || a + b < c || a + c < b || b + c < a) {
//            throw new IllegalTriangleException("Tam giác không hợp lệ!");
//        }
//    }
}
