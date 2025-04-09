package ss4_class_va_object.bai_tap.lop_phuong_trinh_bac_2;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return 2 * this.b - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return (-this.b + Math.pow(Math.pow(this.b, 2) - 4 * this.a * this.c, 0.5)) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.pow(Math.pow(this.b, 2) - 4 * this.a * this.c, 0.5)) / (2 * this.a);
    }
}
