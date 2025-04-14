package ss6_ke_thua.bai_tap.circle_va_cylinder;

public class Run {
    public static void main(String[] args) {
        Circle circle = new Circle(4, "Yellow");
        System.out.println(circle.getArea());
        System.out.println();
        Cylinder cylinder = new Cylinder(4, "red", 8);
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getVolume());
        System.out.println(cylinder);
    }
}
