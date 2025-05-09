package on_tap.entiry;

public class ForeignCustomer extends Customer{
    String nationality;

    public ForeignCustomer(String id, String name, String nationality) {
        super(id, name);
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "ForeignCustomer{" +
                "nationality='" + nationality + '\'';
    }

    @Override
    public String toCSVFile() {
        return id + "," + name + ",,," + nationality;
    }
}
