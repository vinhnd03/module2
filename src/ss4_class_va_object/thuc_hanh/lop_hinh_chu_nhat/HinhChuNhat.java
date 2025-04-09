package ss4_class_va_object.thuc_hanh.lop_hinh_chu_nhat;

public class HinhChuNhat {
    private int width;
    private int height;

    public HinhChuNhat(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public HinhChuNhat() {

    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return this.height * this.width;
    }

    public int getPerimeter() {
        return (this.height + this.width) * 2;
    }

    public String display() {
        return "Hình chữ nhật có độ dài là: " + this.height + " và độ rộng là: " + this.width;
    }
}
