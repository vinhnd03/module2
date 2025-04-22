package ss12_set_va_map.bai_tap.quan_ly_san_pham.controller;

import ss12_set_va_map.bai_tap.quan_ly_san_pham.common.AcsendingSortByPrice;
import ss12_set_va_map.bai_tap.quan_ly_san_pham.common.DescendingSortByPrice;
import ss12_set_va_map.bai_tap.quan_ly_san_pham.entity.Product;
import ss12_set_va_map.bai_tap.quan_ly_san_pham.service.ProductService;
import ss12_set_va_map.bai_tap.quan_ly_san_pham.view.ProductView;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProductController {
    private static ProductService service = new ProductService();

    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println();
            System.out.println("========== [ Quản lý sản phẩm ] ===========");
            System.out.println("1. Thêm mới sản phẩm");
            System.out.println("2. Cập nhật sản phẩm");
            System.out.println("3. Xóa sản phẩm theo id");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm tăng/giảm dần theo giá");
            System.out.println("7. Thoát");
            System.out.println("==============================================");
            System.out.print("Lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    edit();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    find();
                    break;
                case 6:
                    sort();
                    break;
                case 7:
                    System.out.println("Goodbye");
                    flag = false;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }
        } while (flag);
    }

    private static void sort() {
        Scanner scanner = new Scanner(System.in);
        List<Product> products = service.findAll();
        boolean loop = true;
        int choice;
        do {
            System.out.println("========== [ Sắp xếp ] ===========");
            System.out.println("1. Giá tăng dần");
            System.out.println("2. Giá giảm dần");
            System.out.println("3. Thoát");
            System.out.println("==================================");
            System.out.print("Your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    products.sort(new AcsendingSortByPrice());
                    display();
                    break;
                case 2:
                    products.sort(new DescendingSortByPrice());
                    display();
                    break;
                case 3:
                    loop = false;
                    break;
                default:
                    System.out.println("Không hợp lệ");
                    break;
            }
        }while (loop);

    }

    private static void add() {
        Product product = ProductView.inputProduct();
        service.add(product);
    }

    private static void edit() {
        int id = ProductView.inputId();
        Product foundProduct = service.findById(id);
        if (foundProduct == null) {
            System.out.println("Không tìm thấy sản phẩm.");
        } else {
            Product editedProduct = ProductView.editProduct(foundProduct);
            service.update(editedProduct);
        }
    }

    private static void delete() {
        int id = ProductView.inputId();
        Product foundProduct = service.findById(id);
        if (foundProduct == null) {
            System.out.println("Không tìm thấy sản phẩm.");
        }else{
            service.delete(foundProduct);
            System.out.println("Xóa thành công");
        }
    }

    private static void display(){
        List<Product> products = service.findAll();
        if(products.size()==0){
            System.out.println("Danh sách trống");
        }else{
            ProductView.displayProductList(products);
        }

    }

    private static void find(){
        String name = ProductView.inputName();
        List<Product> products = service.findByName(name);
        if(products.size() == 0){
            System.out.println("Danh sách trống");
        }else{
            ProductView.displayProductList(products);
        }
    }
}
