package ss7_abstract_class_va_interface.bai_tap.interface_colorable.shape;

import ss7_abstract_class_va_interface.bai_tap.interface_colorable.IColorable;

public class Square extends Rectangle implements IColorable {

    public Square(double side) {
        super(side, side);
    }

    public Square(){};

    @Override
    public String howToColor(String color) {
        return super.howToColor(color);
    }

    public boolean isSquare(){
        return true;
    }

    public void transformToCube(){
        System.out.println("this is a cube");
    }
}
