package quan_ly_phuong_tien_giao_thong2.entity;

import quan_ly_phuong_tien_giao_thong2.entity.Vehicle;

public class Motorbike extends Vehicle {
    private double capacity;

    public Motorbike() {

    }

    @Override
    public String infoToCSV() {
        return this.capacity + "," + super.getLicensePlate() + "," + super.getBrand() + ","
                + super.getYear() + "," + super.getOwner();
    }

    public Motorbike(double capacity, String licensePlate, String brand,
                     int year, String owner) {
        super(licensePlate, brand, year, owner);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%-10f", capacity);
    }
}
