package ss17_serialization.bai_tap.quan_li_san_pham.view;

import ss17_serialization.bai_tap.quan_li_san_pham.controller.ProductController;
import ss17_serialization.bai_tap.quan_li_san_pham.entity.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    public static void main(String[] args) {
        ProductController.displayMenu();
    }

    public static Product inputNewProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá: ");
        long price = Long.parseLong(scanner.nextLine());
        System.out.print("Nhập hãng: ");
        String brand = scanner.nextLine();
        System.out.print("Nhập mô tả: ");
        String description = scanner.nextLine();

        return new Product(name, price, brand, description);
    }

    public static void displayProductList(List<Product> productList) {

        for (Product p : productList){
            System.out.println(p);
        }

    }

    public static String inputName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm muốn tìm: ");
        return scanner.nextLine();
    }
}
