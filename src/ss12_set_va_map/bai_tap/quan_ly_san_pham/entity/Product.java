package ss12_set_va_map.bai_tap.quan_ly_san_pham.entity;

import ss12_set_va_map.bai_tap.quan_ly_san_pham.common.ReadAndWriteFile;
import ss12_set_va_map.bai_tap.quan_ly_san_pham.common.UpdateId;

import java.util.List;
import java.util.Objects;

public class Product {
    private int id;
    private String name;
    private long price;
    private static int counter = 1;

    public Product() {
        counter++;
    }

    public Product(String name, long price) {
        this.id = ++UpdateId.currentId;
        this.name = name;
        this.price = price;
    }

    public Product(int id, String name, long price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Product product = (Product) object;
        return id == product.id && price == product.price && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }
}
