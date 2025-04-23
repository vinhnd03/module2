package ss12_set_va_map.bai_tap.quan_ly_san_pham.repository;

import ss12_set_va_map.bai_tap.quan_ly_san_pham.common.ReadAndWriteFile;
import ss12_set_va_map.bai_tap.quan_ly_san_pham.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    //private static List<Product> productList = new ArrayList<>();
    private ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    private String path = "src/ss12_set_va_map/bai_tap/quan_ly_san_pham/data/product.csv";

    @Override
    public void add(Product product) {
        readAndWriteFile.writeFile(path, product);
    }

    @Override
    public List<Product> findAll() {
        List<Product> productList = readAndWriteFile.readFile(path);
        return productList;

    }

    @Override
    public Product findById(int id) {
        List<Product> productList = findAll();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                return productList.get(i);
            }
        }
        return null;
    }

    @Override
    public void update(Product product) {
        List<Product> productList = readAndWriteFile.readFile(path);
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == product.getId()) {
                productList.set(i, product);
                readAndWriteFile.writeFile(path, productList);
                break;
            }
        }
    }

    @Override
    public void delete(Product product) {
        List<Product> productList = readAndWriteFile.readFile(path);
        productList.remove(product);
        readAndWriteFile.writeFile(path, productList);
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> productList = readAndWriteFile.readFile(path);
        List<Product> foundProducts = new ArrayList<>();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().toLowerCase().contains(name.toLowerCase())) {
                foundProducts.add(productList.get(i));
            }
        }
        return foundProducts;
    }


}
