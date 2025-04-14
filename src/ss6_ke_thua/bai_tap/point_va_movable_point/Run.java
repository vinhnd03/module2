package ss6_ke_thua.bai_tap.point_va_movable_point;

public class Run {
    public static void main(String[] args) {
        Point point = new Point(3,4);
        System.out.println(point.getXY()[0] + " " + point.getXY()[1]);
        System.out.println(point);
        System.out.println();

        MovabalePoint movabalePoint = new MovabalePoint(3,4,5,6);
        System.out.println(movabalePoint.move());
        System.out.println(movabalePoint.move());
        System.out.println(movabalePoint.move());
        System.out.println(movabalePoint.move());
    }
}
