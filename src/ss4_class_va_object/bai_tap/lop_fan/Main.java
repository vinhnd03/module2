package ss4_class_va_object.bai_tap.lop_fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setRadius(Speed.MEDIUM);
        System.out.println(fan1.toString());
        System.out.println();
        Fan fan2 = new Fan();
        fan2.setSpeed(Speed.FAST);
        fan2.setRadius(10);
        fan2.setStatus(true);
        fan2.setColor("Yellow");
        System.out.println(fan2.toString());
    }
}
