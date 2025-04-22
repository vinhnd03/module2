package ss12_set_va_map.bai_tap.quan_ly_san_pham.repository;

import ss12_set_va_map.bai_tap.quan_ly_san_pham.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository{
    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product("May tinh", 200000));
        productList.add(new Product("Laptop", 150000));
        productList.add(new Product("Ban phim", 100000));
        productList.add(new Product("Man hinh", 130000));
    }
    @Override
    public void add(Product product) {
        productList.add(product);
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public Product findById(int id) {
        for (int i = 0; i < productList.size(); i++){
            if(productList.get(i).getId() == id){
                return productList.get(i);
            }
        }
        return null;
    }

    @Override
    public void update(Product product) {
        for(int i = 0; i < productList.size(); i++){
            if(productList.get(i).getId() == product.getId()){
                productList.set(i, product);
                break;
            }
        }
    }

    @Override
    public void delete(Product product) {
        productList.remove(product);
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getName().toLowerCase().contains(name.toLowerCase())){
                products.add(productList.get(i));
            }
        }
        return products;
    }


}
