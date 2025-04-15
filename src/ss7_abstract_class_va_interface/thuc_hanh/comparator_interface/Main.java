package ss7_abstract_class_va_interface.thu_hanh.comparator_interface;

import ss6_ke_thua.thuc_hanh.doi_tuong_hinh_hoc.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle("indigo", false, 3.5);

        System.out.println("Pre-sort:");
        for (Circle circle : circles){
            System.out.println(circle);
        }

        Comparator comparator = new CircleComparator();
        Arrays.sort(circles, comparator);

        System.out.println("After sort:");
        for(Circle circle : circles){
            System.out.println(circle);
        }
    }
}
