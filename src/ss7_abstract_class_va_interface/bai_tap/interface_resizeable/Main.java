package ss7_abstract_class_va_interface.bai_tap.interface_resizeable;

import ss7_abstract_class_va_interface.bai_tap.interface_resizeable.shape.Circle;
import ss7_abstract_class_va_interface.bai_tap.interface_resizeable.shape.Rectangle;
import ss7_abstract_class_va_interface.bai_tap.interface_resizeable.shape.Square;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Bán kính hình tròn trước khi tăng chiều dài:");
        System.out.println(circle.getRadius());
        System.out.println("Bán kính hình tròn sau khi tăng chiều dài:");
        circle.resize(10);
        System.out.println(circle.getRadius());

        System.out.println();
        Rectangle rectangle = new Rectangle(5,8);
        System.out.println("Chiều rộng và chiều dài HCN trước khi tăng chiều dài:");
        System.out.println(rectangle.getWidth() + " và " + rectangle.getLength());
        rectangle.resize(20);
        System.out.println("Chiều rộng và chiều dài HCN sau khi tăng chiều dài:");
        System.out.println(rectangle.getWidth() + " và " + rectangle.getLength());

        System.out.println();
        Square square = new Square(6, "red", true);
        System.out.println(square);
        square.resize(20);
        System.out.println(square);



    }
}
