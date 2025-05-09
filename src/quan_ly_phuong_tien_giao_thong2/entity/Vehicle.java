package quan_ly_phuong_tien_giao_thong2.entity;


import java.util.Objects;

public abstract class Vehicle {
    private String licensePlate;
    private String brand;
    private int year;
    private String owner;

    public Vehicle() {
    }

    public Vehicle(String licensePlate, String brand, int year, String owner) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.year = year;
        this.owner = owner;
    }

    public abstract String infoToCSV();

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Vehicle vehicle = (Vehicle) object;
        return year == vehicle.year && Objects.equals(licensePlate, vehicle.licensePlate) && Objects.equals(brand, vehicle.brand) && Objects.equals(owner, vehicle.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(licensePlate, brand, year, owner);
    }

    @Override
    public String toString() {
        return String.format("%-15s| %-15s| %-10d| %-20s| ",
                licensePlate, brand, year, owner);
    }
}
