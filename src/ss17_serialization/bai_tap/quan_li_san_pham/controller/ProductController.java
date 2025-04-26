package ss17_serialization.bai_tap.quan_li_san_pham.controller;

import ss17_serialization.bai_tap.quan_li_san_pham.entity.Product;
import ss17_serialization.bai_tap.quan_li_san_pham.service.ProductService;
import ss17_serialization.bai_tap.quan_li_san_pham.view.ProductView;

import java.util.List;
import java.util.Scanner;

public class ProductController {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductService service = new ProductService();
    public static void displayMenu() {
        int choice;
        boolean flag = true;
        do{
            System.out.println("=====Quản lý sản phẩm======");
            System.out.println("1. Thêm mới");
            System.out.println("2. Hiển thị");
            System.out.println("3. Tìm kiếm");
            System.out.println("4. thoát");
            System.out.println("=====Quản lý sản phẩm======");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    add();
                    break;
                case 2:
                    display();
                    break;
                case 3 :
                    search();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    flag = false;
                    break;
                default:
                    System.out.println("Không hợp lệ!");
                    break;
            }
        }while (flag);
    }

    private static void add(){
        Product product = ProductView.inputNewProduct();
        service.add(product);
        System.out.println("Thành công");
    }

    private static void display(){
        List<Product> productList = service.findAll();
        if(productList != null){
            ProductView.displayProductList(productList);
        }else{
            System.out.println("Danh sách trống");
        }
    }

    private static void search(){
        String name = ProductView.inputName();
        List<Product> productList = service.findByName(name);
        if(productList != null){
            ProductView.displayProductList(productList);
        }else{
            System.out.println("Không tìm thấy");
        }
    }
}
