package on_tap.entiry;

public class LocalCustomer extends Customer{
    String type;
    double consumption;

    public LocalCustomer(String id, String name, String type, double consumption) {
        super(id, name);
        this.type = type;
        this.consumption = consumption;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    @Override
    public String toString() {
        return "LocalCustomer{" +
                "type='" + type + '\'' +
                ", consumption=" + consumption;
    }

    @Override
    public String toCSVFile() {
        return id + "," + name + "," + type + "," + consumption + ",";
    }
}
