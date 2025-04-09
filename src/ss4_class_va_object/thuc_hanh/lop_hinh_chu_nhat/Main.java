package ss4_class_va_object.thuc_hanh.lop_hinh_chu_nhat;

public class Main {
    public static void main(String[] args) {
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        hinhChuNhat.setHeight(5);
        hinhChuNhat.setWidth(3);
        System.out.println(hinhChuNhat.display());
        System.out.print("Diện tích: " + hinhChuNhat.getArea());
        System.out.println();
        System.out.print("Chu vi: " + hinhChuNhat.getPerimeter());

    }
}
