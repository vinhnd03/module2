package quan_ly_phuong_tien_giao_thong.view;

import quan_ly_phuong_tien_giao_thong.controller.VehicleController;

import java.util.Scanner;

public class VehicleView {
    public static void main(String[] args) {
        VehicleController.displayMenu();
    }

    public static String inputLicensePlate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập biển số của xe muốn xóa: ");
        String string = scanner.nextLine();
        return string;

    }

    public static boolean confirm() {
        Scanner scanner = new Scanner(System.in);
        String confirm;
        do {
            System.out.println("Bạn có muốn xóa phương tiện này không? (Y/N)");
            confirm = scanner.nextLine();
            confirm = confirm.toLowerCase();
        } while (!confirm.equals("y") && !confirm.equals("n"));
        if (confirm.equals("y")) {
            return true;
        } else {
            return false;
        }
    }
}
