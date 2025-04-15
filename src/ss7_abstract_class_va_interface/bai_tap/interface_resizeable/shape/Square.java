package ss7_abstract_class_va_interface.bai_tap.interface_resizeable.shape;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public void setSide(double size) {
        super.setWidth(size);
        super.setLength(size);
    }

    public double getSide() {
        return super.getWidth();
    }

    @Override
    public void resize(double percent) {
        setSide(getWidth() + (getWidth() * percent / 100));
    }
}
