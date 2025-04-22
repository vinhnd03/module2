package ss12_set_va_map.bai_tap.quan_ly_san_pham.service;

import ss12_set_va_map.bai_tap.quan_ly_san_pham.entity.Product;
import ss12_set_va_map.bai_tap.quan_ly_san_pham.repository.IProductRepository;
import ss12_set_va_map.bai_tap.quan_ly_san_pham.repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService{
    private IProductRepository repository = new ProductRepository();
    @Override
    public void add(Product product) {
        repository.add(product);
    }

    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public Product findById(int id) {
        return repository.findById(id);
    }

    @Override
    public void update(Product product) {
        repository.update(product);
    }

    @Override
    public void delete(Product product) {
        repository.delete(product);
    }

    @Override
    public List<Product> findByName(String name) {
        return repository.findByName(name);
    }
}
