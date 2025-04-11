package ss5_modifier_static_package.thuc_hanh.static_method;

public class Student {
    private int rollno;
    private String name;
    private static String collage = "FPT";

    public Student(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }

    static void change(){
        collage = "CODEGYM";
    }

    void display(){
        System.out.println(rollno + " " + name + " " + collage);
    }
}
