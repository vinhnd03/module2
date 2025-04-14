package ss6_ke_thua.thuc_hanh.doi_tuong_hinh_hoc;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle() {
        this.radius = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getPerimeter(){
        return Math.PI * 2 * this.radius;
    }

    @Override
    public String toString() {
        return "A circle with radius = " + this.radius + ", with is a subclass of " + super.toString();
    }
}
