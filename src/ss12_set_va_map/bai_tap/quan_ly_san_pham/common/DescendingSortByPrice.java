package ss12_set_va_map.bai_tap.quan_ly_san_pham.common;

import ss12_set_va_map.bai_tap.quan_ly_san_pham.entity.Product;

import java.util.Comparator;

public class DescendingSortByPrice implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o2.getPrice() - o1.getPrice());
    }
}
