package ss17_serialization.bai_tap.quan_li_san_pham.repository;

import ss17_serialization.bai_tap.quan_li_san_pham.entity.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    void add(Product product);

    List<Product> findByName(String name);
}
