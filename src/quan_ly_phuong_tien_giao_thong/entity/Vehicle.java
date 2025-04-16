package quan_ly_phuong_tien_giao_thong.entity;


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
    public String toString() {
        return String.format("%-15s| %-15s| %-10d| %-20s| ",
                licensePlate, brand, year, owner);
    }
}
