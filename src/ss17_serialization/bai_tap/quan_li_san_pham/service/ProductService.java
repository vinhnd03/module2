package ss17_serialization.bai_tap.quan_li_san_pham.service;

import ss17_serialization.bai_tap.quan_li_san_pham.entity.Product;
import ss17_serialization.bai_tap.quan_li_san_pham.repository.IProductRepository;
import ss17_serialization.bai_tap.quan_li_san_pham.repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService{
    private IProductRepository repository = new ProductRepository();

    @Override
    public List<Product> findAll() {
        if(repository.findAll().size() > 0){
            return repository.findAll();
        }
        return null;
    }

    @Override
    public void add(Product product) {
        repository.add(product);
    }

    @Override
    public List<Product> findByName(String name) {
        if(repository.findByName(name).size() > 0){
            return repository.findByName(name);
        }
        return null;
    }
}
