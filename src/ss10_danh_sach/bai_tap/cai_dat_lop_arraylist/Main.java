package ss10_danh_sach.bai_tap.cai_dat_lop_arraylist;

public class Main {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1, "Vinh");
        Student b = new Student(1, "Vinh");
        Student c = new Student(1, "Vinh");
        Student d = new Student(1, "Vinh");
        Student e = new Student(1, "Vinh");
        Student f = new Student(1, "Vinh3");

        MyArrayList<Student> students = new MyArrayList<>();
        students.add(a);
        students.add(b);
        students.add(c);
        students.add(d);
        students.add(e);
        students.add(new Student(2, "Huy"), 2);
        //students.clear();

        System.out.println(students.get(2).getName());
        System.out.println(students.indexOf(c));
        System.out.println(students.contains(f));
        System.out.println();
        MyArrayList<Student> list = students.clone();
        list.remove(2);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
        }

    }


}
