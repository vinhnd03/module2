package ss15_exception_va_debug.bai_tap.lop_exception_tam_giac;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle() {

    }

    public Triangle(int a, int b, int c) throws IllegalTriangleException {
            checkTriangle(a, b, c);
            this.a = a;
            this.b = b;
            this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    private void checkTriangle(int a, int b, int c) throws IllegalTriangleException {
        if (a < 1 || b < 1 || c < 1 || a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Tam giác không hợp lệ!");
        }
    }
}
