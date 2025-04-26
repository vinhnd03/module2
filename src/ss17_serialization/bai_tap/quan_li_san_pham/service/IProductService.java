package ss17_serialization.bai_tap.quan_li_san_pham.service;

import ss17_serialization.bai_tap.quan_li_san_pham.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void add(Product product);

    List<Product> findByName(String name);
}
