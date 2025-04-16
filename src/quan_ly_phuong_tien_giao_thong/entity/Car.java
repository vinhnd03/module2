package quan_ly_phuong_tien_giao_thong.entity;

public class Car extends Vehicle{
    private int numberOfSeats;
    private String type;

    public Car() {
    }

    public Car(int numberOfSeats, String type, String licensePlate, String brand, int year,
               String owner) {
        super(licensePlate, brand, year, owner);
        this.numberOfSeats = numberOfSeats;
        this.type = type;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }




    @Override
    public String toString() {
        return super.toString() + String.format("%-10d| %-20s", numberOfSeats, type);
    }
}
