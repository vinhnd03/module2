package ss12_set_va_map.bai_tap.quan_ly_san_pham.common;

import ss12_set_va_map.bai_tap.quan_ly_san_pham.entity.Product;

import java.util.List;

public class UpdateId {
    private static ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    private static List<Product> products =
            readAndWriteFile.readFile("src/ss12_set_va_map/bai_tap/quan_ly_san_pham/data/product.csv");
    public static int currentId = products.get(products.size()-1).getId();

}
