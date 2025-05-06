package case_study.entity;

public class Employee extends Person{
    private String qualification;
    private String position;
    private long salary;

    public Employee() {
    }

    public Employee(String id, String name, String birthday, String idCard, boolean gender,
                    String phone, String email, String qualification, String position, long salary) {
        super(id, name, birthday, idCard, gender, phone, email);
        this.qualification = qualification;
        this.position = position;
        this.salary = salary;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                "qualification='" + qualification + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public String infoToCSVFile() {
        return super.getId() + "," + super.getName() + "," + super.getBirthday() + "," + super.getIdCard() + "," +
                super.isGender() + "," + super.getPhone() + "," + super.getEmail() + "," + this.qualification + "," + this.position
                + "," + this.salary;
    }
}
