package case_study.entity;

public class Customer extends Person {
    private String rank;
    private String address;

    public Customer() {
    }

    ;

    public Customer(String id, String name, String birthday, String idCard, boolean gender
            , String phone, String email, String rank, String address) {
        super(id, name, birthday, idCard, gender, phone, email);
        this.rank = rank;
        this.address = address;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString() +
                "type='" + rank + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public String infoToCSVFile() {
        return super.getId() + "," + super.getName() + "," + super.getBirthday() + "," + super.getIdCard() + "," +
                super.isGender() + "," + super.getPhone() + "," + super.getEmail() + "," + this.rank + "," + this.address;
    }
}
