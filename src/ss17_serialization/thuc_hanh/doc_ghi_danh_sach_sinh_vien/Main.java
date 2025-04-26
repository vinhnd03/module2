package ss17_serialization.thuc_hanh.doc_ghi_danh_sach_sinh_vien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static void writeDataToFile(String path, List<Student> studentList) throws IOException {
        File file = new File(path);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeObject(studentList);
        objectOutputStream.close();
    }

    private static List<Student> readFileToList(String path) throws IOException, ClassNotFoundException {
        File file = new File(path);
        List<Student> students = new ArrayList<>();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        students = (List<Student>) objectInputStream.readObject();
        objectInputStream.close();
        return students;
    }
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        String path = "src/ss17_serialization/thuc_hanh/doc_ghi_danh_sach_sinh_vien/student.txt";
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        try {
            writeDataToFile(path, students);
            System.out.println("Success!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            List<Student> readList = readFileToList(path);
            for (Student s : readList){
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
