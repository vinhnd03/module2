package ss6_ke_thua.thuc_hanh.doi_tuong_hinh_hoc;

public class Square extends Rectangle{
    public Square(double side) {
        super(side, side);
    }

    public Square() {
        super(1, 1);
    }

    @Override
    public void setWidth(double side){
        super.setWidth(side);
        super.setHeight(side);
    }

    public Square(double side, String color, boolean filled){
        super(color, filled, side, side);
    }

    @Override
    public void setHeight(double side){
        super.setWidth(side);
        super.setHeight(side);
    }

    @Override
    public String toString() {
        return "A square with side = " + super.getWidth() + ", which ís a subclass of " + super.toString();
    }
}
