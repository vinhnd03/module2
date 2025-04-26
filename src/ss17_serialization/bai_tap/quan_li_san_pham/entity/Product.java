package ss17_serialization.bai_tap.quan_li_san_pham.entity;

import ss17_serialization.bai_tap.quan_li_san_pham.common.UpdateId;

import java.io.Serializable;

public class Product implements Serializable {
    private static int countid = 1;
    private int id;
    private String name;
    private long price;
    private String brand;
    private String description;

    public Product() {
        countid++;
    }

    public Product(String name, long price, String brand, String description) {
        this.id = ++UpdateId.currentId;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.description = description;
    }

    public Product(int id, String name, long price, String brand, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.description = description;
    }


    public static int getCountid() {
        return countid;
    }

    public static void setCountid(int countid) {
        Product.countid = countid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
