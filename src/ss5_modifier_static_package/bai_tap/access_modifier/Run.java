package ss5_modifier_static_package.bai_tap.access_modifier;

public class Run {
    public static void main(String[] args) {
        Circle circle = new Circle(4);

        System.out.println("Bán kính: " + circle.getRadius());
        System.out.println("Diện tích: " + String.format("%.3f", circle.getArea()));
    }
}
