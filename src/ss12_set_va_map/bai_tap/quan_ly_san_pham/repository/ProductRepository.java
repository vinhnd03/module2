package ss12_set_va_map.bai_tap.quan_ly_san_pham.repository;

import ss12_set_va_map.bai_tap.quan_ly_san_pham.entity.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    //private static List<Product> productList = new ArrayList<>();

    static {
        try (BufferedReader reader = new BufferedReader(new FileReader(
                "src/ss12_set_va_map/bai_tap/quan_ly_san_pham/data/product.csv"))) {
            String line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String name = parts[0].trim();
                    long price = Long.parseLong(parts[1].trim());
                    productList.add(new Product(name, price));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeFile(){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(
                "src/ss12_set_va_map/bai_tap/quan_ly_san_pham/data/product.csv",))) {
            writer.write("Name,Price");
            writer.newLine();
            for(Product product : productList){
                writer.write(product.getName() + "," + product.getPrice());
                writer.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    @Override
    public void add(Product product) {
        productList.add(product);
        writeFile();
    }

    @Override
    public List<Product> findAll() {
        List<Product> productList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(
                "src/ss12_set_va_map/bai_tap/quan_ly_san_pham/data/product.csv"))) {
            String line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String name = parts[0].trim();
                    long price = Long.parseLong(parts[1].trim());
                    productList.add(new Product(name, price));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productList;

    }

    @Override
    public Product findById(int id) {
        for (int i = 0; i < findAll().size(); i++) {
            if (findAll().get(i).getId() == id) {
                return productList.get(i);
            }
        }
        return null;
    }

    @Override
    public void update(Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == product.getId()) {
                productList.set(i, product);
                writeFile();
                break;
            }
        }
    }

    @Override
    public void delete(Product product) {
        productList.remove(product);
        writeFile();
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().toLowerCase().contains(name.toLowerCase())) {
                products.add(productList.get(i));
            }
        }
        return products;
    }


}
