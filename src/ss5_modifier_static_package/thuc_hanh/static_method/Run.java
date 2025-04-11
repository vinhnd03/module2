package ss5_modifier_static_package.thuc_hanh.static_method;

public class Run {
    public static void main(String[] args) {
        //gọi trực tiếp bằng tên lớp + phương thức static
        Student.change();

        Student student1 = new Student(111, "Vĩnh");
        Student student2 = new Student(222, "Huy");
        Student student3 = new Student(333, "Chiến");

        student1.display();;
        student2.display();
        student3.display();
    }
}
