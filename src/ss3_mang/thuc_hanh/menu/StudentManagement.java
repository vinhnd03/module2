package ss3_mang.thuc_hanh.menu;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StudentManagement {
    private static Student[] students = new Student[100];
    private Scanner scanner = new Scanner(System.in);
    private static int quantity = 0;

    static {
        for (int i = 0; i < 3; i++) {
            quantity++;
            students[i] = new Student(quantity, "Vĩnh " + quantity, "Đà Nẵng");
        }
    }

    public void display() {
        int count = 0;


        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                count++;
                //System.out.println(students[i]);
            } else {
                break;
            }
        }

        Student[] newList = new Student[count];
        for (int i = 0; i < students.length; i++){
            if(students[i] != null){
                newList[i] = students[i];
            }else{
                break;
            }
        }

        Arrays.sort(newList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getId() - o1.getId();
            }
        });

        //Arrays.sort(newList, (s1, s2) -> s1.getName().compareTo(s2.getName()));

        for (int i = 0; i < newList.length; i++) {
            if (newList[i] != null) {
                System.out.println(newList[i]);
            } else {
                break;
            }
        }
    }

    public void add() {
        System.out.print("Nhập tên sinh viên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String address = scanner.nextLine();

        Student student = new Student(++quantity, name, address);

        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
        System.out.println("Thêm mới thành công");
    }

    public void delete() {
        System.out.print("Nhập id sinh viên muốn xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = false;

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getId() == id) {
                    for (int j = i; j < students.length; j++) {
                        if (j == students.length - 1) {
                            students[j] = null;
                        } else {
                            if (students[j] != null) {
                                students[j] = students[j + 1];
                            }
                        }
                    }
                    check = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy sinh viên!");
        } else {
            System.out.println("Xóa sinh viên thành công!");
        }
    }

    public void update() {
        System.out.print("Nhập id sinh viên muốn cập nhật: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = false;

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getId() == id) {
                    change(students[i]);
                    check = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (check == false) {
            System.out.println("Không tìm thấy sinh viên!");
        } else {
            System.out.println("Hoàn tất cập nhật!");
        }


    }

    private void change(Student student) {
        boolean loop = true;
        do {
            System.out.println("======[" + student.toString() + "]======");
            System.out.println("Chọn mục bạn muốn sửa:");
            System.out.println("1. Tên");
            System.out.println("2. Địa chỉ");
            System.out.println("3. Xong");
            System.out.print("Chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Nhập tên muốn sửa: ");
                    String newName = scanner.nextLine();
                    student.setName(newName);
                    System.out.println("Đổi tên thành công");
                    break;
                case 2:
                    System.out.print("Nhập địa chỉ muốn sửa: ");
                    String newAddress = scanner.nextLine();
                    student.setAddress(newAddress);
                    System.out.println("Đổi địa chỉ thành công");
                    break;
                case 3:
                    loop = false;
                    break;
                default:
                    System.out.println("Xin mời chọn lại.");
                    break;
            }
        } while (loop);
    }

    public void search() {
        System.out.print("Nhập tên sinh viên muốn tìm: ");
        String name = scanner.nextLine();
        Student[] foundStudents = new Student[100];

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getName().toLowerCase().contains(name.toLowerCase())) {
                    for (int j = 0; j < foundStudents.length; j++) {
                        if (foundStudents[j] == null) {
                            foundStudents[j] = students[i];
                            break;
                        }
                    }
                }
            } else {
                break;
            }

        }

        if (foundStudents[0] == null) {
            System.out.println("Tên sinh viên không trùng khớp");
        } else {
            System.out.println("Danh sách sinh viên có [" + name + "] trong tên:");
            for (int i = 0; i < foundStudents.length; i++) {
                if (foundStudents[i] != null) {
                    System.out.println(foundStudents[i]);
                } else {
                    break;
                }
            }
        }
    }

    public void askForContinue() {
        System.out.print("Bạn có muốn tiếp tục? (y/n): ");

        do {
            String conti = scanner.nextLine();
            if (conti.toLowerCase().equals("y") || conti.equals("1")) {
                break;
            } else if (conti.toLowerCase().equals("n") || conti.equals("0")) {
                System.out.println("Goodbye!");
                System.exit(0);
            } else {
                System.out.print("Vui lòng nhập y hoặc n: ");
            }

        } while (true);
    }
}
