package ss12_set_va_map.thuc_hanh.su_dung_map_de_luu_sinh_vien_theo_tuoi;

import java.util.Objects;

public class Student{
    private int id ;
    private String name;
    private int old;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student() {
    }

    public Student(int id, String name, int old) {
        this.id = id;
        this.name = name;
        this.old = old;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", old=" + old +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, old);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return id == student.id && old == student.old && Objects.equals(name, student.name);
    }

//    @Override
//    public int compareTo(Student o) {
//        int result = this.getId() - o.getId();
//        if(result == 0){
//            return this.getName().compareTo(o.getName());
//        }
//        return result;
//    }


}
