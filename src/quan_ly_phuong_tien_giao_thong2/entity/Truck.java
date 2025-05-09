package quan_ly_phuong_tien_giao_thong2.entity;

import quan_ly_phuong_tien_giao_thong2.entity.Vehicle;

public class Truck extends Vehicle {
    private double payload;

    public Truck(){

    }

    @Override
    public String infoToCSV() {
        return this.getPayload() + "," + super.getLicensePlate() + "," + super.getBrand() + ","
                + super.getYear() + "," + super.getOwner();
    }

    public Truck(double payload, String licensePlate, String brand,
                 int year, String owner) {
        super(licensePlate, brand, year, owner);
        this.payload = payload;
    }

    public double getPayload() {
        return payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%-10f", payload);
    }
}
