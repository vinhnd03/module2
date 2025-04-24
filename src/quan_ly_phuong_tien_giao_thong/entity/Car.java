package quan_ly_phuong_tien_giao_thong.entity;

import java.util.Objects;

public class Car extends Vehicle{
    private int numberOfSeats;
    private String type;

    public Car() {
    }

    @Override
    public String infoToCSV() {
        return this.numberOfSeats + "," + this.type + "," + super.getLicensePlate() + "," + super.getBrand() + ","
                + super.getYear() + "," + super.getOwner();
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
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Car car = (Car) object;
        return numberOfSeats == car.numberOfSeats && Objects.equals(type, car.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfSeats, type);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%-10d| %-20s", numberOfSeats, type);
    }
}
