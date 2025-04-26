package ss17_serialization.bai_tap.quan_li_san_pham.common;

import ss17_serialization.bai_tap.quan_li_san_pham.entity.Product;
import ss17_serialization.bai_tap.quan_li_san_pham.service.ProductService;

import java.util.List;

public class UpdateId {


    private static int getCurrentId(){
        ProductService service = new ProductService();
        List<Product> products = service.findAll();
        if(products != null){
            return products.get(products.size()-1).getId();
        }else{
            return 0;
        }
    }
    public static int currentId = getCurrentId();
}
