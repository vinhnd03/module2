package ss17_serialization.bai_tap.quan_li_san_pham.repository;

import ss17_serialization.bai_tap.quan_li_san_pham.common.FileAction;
import ss17_serialization.bai_tap.quan_li_san_pham.entity.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository{
    private static final String FILE_PATH = "src/ss17_serialization/bai_tap/quan_li_san_pham/data/product.dat";
    @Override
    public List<Product> findAll() {
        List<Product> productList = FileAction.readBinaryFile(FILE_PATH);
        return productList;
    }

    @Override
    public void add(Product product) {
            List<Product> productList = FileAction.readBinaryFile(FILE_PATH);
            productList.add(product);
            FileAction.writeBinaryFile(FILE_PATH, productList);
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> productList = FileAction.readBinaryFile(FILE_PATH);
        List<Product> foundProducts = new ArrayList<>();
        for (Product p : productList){
            if(p.getName().toLowerCase().contains(name.toLowerCase())){
                foundProducts.add(p);
            }
        }
        return foundProducts;
    }
}
