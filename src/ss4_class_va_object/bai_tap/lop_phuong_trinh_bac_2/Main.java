package ss4_class_va_object.bai_tap.lop_phuong_trinh_bac_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation phuongTri1 = new QuadraticEquation();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        phuongTri1.setA(a);
        phuongTri1.setB(b);
        phuongTri1.setC(c);

        if(phuongTri1.getDiscriminant() > 0){
            System.out.println("Phương trình có 2 nghiệm: " + String.format("%.3f", phuongTri1.getRoot1()) +
                    " và " + String.format("%.3f", phuongTri1.getRoot2()));
        }else if(phuongTri1.getDiscriminant() == 0){
            System.out.println("Phương tình có nghiệm kép: " + phuongTri1.getRoot1());
        }else{
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
