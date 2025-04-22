package ss12_set_va_map.bai_tap.quan_ly_san_pham.entity;

public class Product {
    private int id;
    private String name;
    private long price;
    private static int counter = 1;

    public Product() {
        counter++;
    }

    public Product(String name, long price) {
        this.id = counter++;
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
}
