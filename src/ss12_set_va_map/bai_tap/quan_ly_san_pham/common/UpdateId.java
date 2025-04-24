package ss12_set_va_map.bai_tap.quan_ly_san_pham.common;

import ss12_set_va_map.bai_tap.quan_ly_san_pham.entity.Product;
import ss12_set_va_map.bai_tap.quan_ly_san_pham.service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class UpdateId {
    private static ProductService service = new ProductService();

    private static List<Product> products = service.findAll();
    public static int currentId = products.get(products.size()-1).getId();

}
