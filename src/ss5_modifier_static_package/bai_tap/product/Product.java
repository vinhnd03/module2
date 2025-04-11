package ss5_modifier_static_package.bai_tap.product;

import java.text.DecimalFormat;

public class Product {
    private int id = 0;
    private String name;
    private double price;

    public Product() {

    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,###");
        return String.format("%-5d| %-20s| %-10s", id, this.name, df.format(this.price) + " VND");
    }
}
