package case_study.entity;

import java.util.Objects;

public abstract class Facility {
    private String id;
    private String name;
    private double area;
    private long price;
    private int max;
    private String type;
    private boolean maintenance;

    public Facility() {
    }

    public Facility(String id, String name, double area, long price, int max, String type) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.price = price;
        this.max = max;
        this.type = type;
        this.maintenance = false;
    }

    public Facility(String id, String name, double area, long price, int max, String type, boolean maintenance) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.price = price;
        this.max = max;
        this.type = type;
        this.maintenance = maintenance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isMaintenance() {
        return maintenance;
    }

    public void setMaintenance(boolean maintenance) {
        this.maintenance = maintenance;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", max=" + max +
                ", type='" + type + '\'' +
                ", maintenance='" + maintenance + '\'' +
                ", ";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Facility facility = (Facility) object;
        return Double.compare(area, facility.area) == 0 && price == facility.price && max == facility.max && Objects.equals(id, facility.id) && Objects.equals(name, facility.name) && Objects.equals(type, facility.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, area, price, max, type);
    }

    public String infoToCSVFile(){
        return id + "," + name + "," + area + "," + price + "," + max + "," + type;
    };


}
