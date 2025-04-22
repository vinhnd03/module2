package ss12_set_va_map.bai_tap.quan_ly_san_pham.view;

import ss12_set_va_map.bai_tap.quan_ly_san_pham.controller.ProductController;
import ss12_set_va_map.bai_tap.quan_ly_san_pham.entity.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {

    public static void main(String[] args) {
        ProductController.displayMenu();
    }

    public static Product inputProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();

        System.out.print("Nhập giá sản phẩm: ");
        long price = Long.parseLong(scanner.nextLine());

        return new Product(name, price);
    }

    public static void displayProductList(List<Product> products) {
        for (int i = 0; i < products.size(); i++){
            System.out.println(products.get(i));
        }
    }

    public static int inputId() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập id sản phẩm: ");
        int id = Integer.parseInt(scanner.nextLine());
        return id;
    }

    public static Product editProduct(Product foundProduct) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên mới: ");
        foundProduct.setName(scanner.nextLine());
        System.out.print("Nhập giá mới: ");
        foundProduct.setPrice(Long.parseLong(scanner.nextLine()));
        return foundProduct;
    }

    public static String inputName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        return name;
    }
}
