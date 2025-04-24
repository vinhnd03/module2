package ss12_set_va_map.bai_tap.quan_ly_san_pham.repository;

import ss12_set_va_map.bai_tap.quan_ly_san_pham.common.ReadAndWriteFile;
import ss12_set_va_map.bai_tap.quan_ly_san_pham.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static final String PATH = "src/ss12_set_va_map/bai_tap/quan_ly_san_pham/data/product.csv";

    private List<String> convertToStringArray(List<Product> products){
        List<String> stringList = new ArrayList<>();
        for (Product p: products){
            stringList.add(p.convertToString());
        }
        return stringList;
    }
    @Override
    public void add(Product product) {
        List<String> stringList = new ArrayList<>();
        stringList.add(product.convertToString());
        ReadAndWriteFile.writeFileCSV(PATH, stringList, true);
    }

    @Override
    public List<Product> findAll() {
        List<Product> productList = new ArrayList<>();
        List<String> list = ReadAndWriteFile.readFileCSV(PATH);
        for (String s : list){
            String[] array = s.split(",");
            productList.add(new Product(Integer.parseInt(array[0]), array[1], Long.parseLong(array[2])));
        }
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
        List<Product> productList = findAll();
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getId() == product.getId()){
                productList.set(i, product);
                break;
            }
        }
        List<String> stringList = convertToStringArray(productList);
        ReadAndWriteFile.writeFileCSV(PATH, stringList, false);

    }

    @Override
    public void delete(Product product) {
        List<Product> productList = findAll();
        productList.remove(product);
        List<String> stringList = convertToStringArray(productList);
        ReadAndWriteFile.writeFileCSV(PATH, stringList, false);

    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> productList = findAll();
        List<Product> foundProducts = new ArrayList<>();
        for (Product p : productList){
            if(p.getName().toLowerCase().contains(name.toLowerCase())){
                foundProducts.add(p);
            }
        }
        return foundProducts;
    }


}
