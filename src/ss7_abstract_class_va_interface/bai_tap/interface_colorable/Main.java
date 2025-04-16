package ss7_abstract_class_va_interface.bai_tap.interface_colorable;

import ss7_abstract_class_va_interface.bai_tap.interface_colorable.shape.Rectangle;
import ss7_abstract_class_va_interface.bai_tap.interface_colorable.shape.Square;


public class Main {
    public static void main(String[] args) {
        Square square = new Square(6);
        System.out.println(square.howToColor("Red"));
        System.out.println(square);
        System.out.println();

//        //Ngầm định
//        Rectangle rectangle = new Square(4);
//        System.out.println(rectangle.getArea());
//        System.out.println(rectangle.isSquare());
//        //Lỗi
//        //rectangle.transformToCube();
//
//        //Tường minh
//        Square square1 = (Square) rectangle;
//        System.out.println(square1.isSquare());
//        square1.transformToCube();

    }
}
