package ss5_modifier_static_package.bai_tap.product;

import ss3_mang.thuc_hanh.menu.Student;

import java.util.Scanner;

public class ProductManagement {
    private static Product[] products = new Product[100];
    private Scanner scanner = new Scanner(System.in);
    private static int id = 0;

    static {
        for (int i = 0; i < 3; i++) {
            products[i] = new Product(++id, "Vĩnh " + id, 100000);
        }
    }

    public void display() {
        System.out.printf("%-5s| %-20s| %-10s\n", "ID", "Tên", "Giá");
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(products[i]);
            } else {
                break;
            }
        }
    }

    public void add() {
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá: ");
        double price = Double.parseDouble(scanner.nextLine());

        Product product = new Product(++id, name, price);

        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                break;
            }
        }
        System.out.println("Thêm mới thành công");
    }

    public void delete() {
        System.out.print("Nhập id sản phẩm muốn xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = false;

        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                if (products[i].getId() == id) {
                    for (int j = i; j < products.length; j++) {
                        if (j == products.length - 1) {
                            products[j] = null;
                        } else {
                            if (products[j] != null) {
                                products[j] = products[j + 1];
                            }
                        }
                    }
                    check = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy sản phẩm!");
        } else {
            System.out.println("Xóa sản phẩm thành công!");
        }
    }

    public void update() {
        System.out.print("Nhập id sản phẩm muốn cập nhật: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = false;

        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                if (products[i].getId() == id) {
                    change(products[i]);
                    check = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (check == false) {
            System.out.println("Không tìm thấy sản phẩm!");
        } else {
            System.out.println("Hoàn tất cập nhật!");
        }


    }

    private void change(Product product) {
        boolean loop = true;
        do {
            System.out.println("======[" + product.toString() + "]======");
            System.out.println("Chọn mục bạn muốn sửa:");
            System.out.println("1. Tên");
            System.out.println("2. Giá");
            System.out.println("3. Xong");
            System.out.print("Chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Nhập tên muốn sửa: ");
                    String newName = scanner.nextLine();
                    product.setName(newName);
                    System.out.println("Đổi tên thành công");
                    break;
                case 2:
                    System.out.print("Nhập giá muốn sửa: ");
                    Double newPrice = Double.parseDouble(scanner.nextLine());
                    product.setPrice(newPrice);
                    System.out.println("Đổi giá thành công");
                    break;
                case 3:
                    loop = false;
                    break;
                default:
                    System.out.println("Xin mời chọn lại.");
                    break;
            }
        } while (loop);
    }

    public void search() {
        System.out.print("Nhập tên sản phẩm muốn tìm: ");
        String name = scanner.nextLine();
        Product[] foundProducts = new Product[100];

        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                if (products[i].getName().toLowerCase().contains(name.toLowerCase())) {
                    for (int j = 0; j < foundProducts.length; j++) {
                        if (foundProducts[j] == null) {
                            foundProducts[j] = products[i];
                            break;
                        }
                    }
                }
            } else {
                break;
            }

        }

        if (foundProducts[0] == null) {
            System.out.println("Tên sinh viên không trùng khớp");
        } else {
            System.out.println("Danh sách sinh viên có [" + name + "] trong tên:");
            System.out.printf("%-5s| %-20s| %-10s\n", "ID", "Tên", "Giá");
            for (int i = 0; i < foundProducts.length; i++) {
                if (foundProducts[i] != null) {
                    System.out.println(foundProducts[i]);
                } else {
                    break;
                }
            }
        }
    }

    public void askForContinue() {
        System.out.print("Bạn có muốn tiếp tục? (y/n): ");

        do {
            String conti = scanner.nextLine();
            if (conti.toLowerCase().equals("y") || conti.equals("1")) {
                break;
            } else if (conti.toLowerCase().equals("n") || conti.equals("0")) {
                System.out.println("Goodbye!");
                System.exit(0);
            } else {
                System.out.print("Vui lòng nhập y hoặc n: ");
            }

        } while (true);
    }
}
