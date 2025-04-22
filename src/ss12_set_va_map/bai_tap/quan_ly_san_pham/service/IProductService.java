package ss12_set_va_map.bai_tap.quan_ly_san_pham.service;

import ss12_set_va_map.bai_tap.quan_ly_san_pham.entity.Product;

import java.util.List;

public interface IProductService {
    void add(Product product);

    List<Product> findAll();

    Product findById(int id);

    void update(Product product);

    void delete(Product product);

    List<Product> findByName(String name);
}
