package quan_ly_phuong_tien_giao_thong.common;

import quan_ly_phuong_tien_giao_thong.entity.Vehicle;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    // phương thức ghi
    public static void writeFileCSV(String pathFile, List<String> stringList, boolean append) {
        File file = new File(pathFile);
        try (FileWriter fileWriter = new FileWriter(file, append);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (String line : stringList) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("lôi đọc file");
        }
    }

    // phương thưc đọc
    public static List<String> readFileCSV(String pathFile) {
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (IOException e) {
            System.out.println("lỗi đọc file");
        }
        return stringList;
    }


}


//    public List<Product> readFile(String path) {
//        List<Product> products = new ArrayList();
//        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
//            String line = null;
//            while ((line = reader.readLine()) != null) {
//                String[] parts = line.split(",");
//                if (parts.length == 3) {
//                    int id = Integer.parseInt(parts[0].trim());
//                    String name = parts[1].trim();
//                    long price = Long.parseLong(parts[2].trim());
//                    products.add(new Product(id, name, price));
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return products;
//    }
//
//    public void writeFile(String path, Product product) {
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
//            writer.newLine();
//            writer.write(product.getId() + "," + product.getName() + "," + product.getPrice());
//            writer.newLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void writeFile(String path, List<Product> products) {
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, false))) {
//            for (Product product : products) {
//                writer.write(product.getId() + "," + product.getName() + "," + product.getPrice());
//                writer.newLine();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

