package quan_ly_phuong_tien_giao_thong.view;

import quan_ly_phuong_tien_giao_thong.entity.Motorbike;
import quan_ly_phuong_tien_giao_thong.service.MotorbikeService;

import java.util.ArrayList;
import java.util.Scanner;

public class MotorbikeView {
    private static MotorbikeService motorbikeService = new MotorbikeService();

    public static void displayMotorbike(ArrayList<Motorbike> motorbikes){
        System.out.println("Danh sách xe máy");
        System.out.printf("%-15s| %-15s| %-10s| %-20s| %-10s\n", "Biển số", "Hãng", "Năm sx", "Chủ sở hữu", "Công suất");
        for (int i = 0; i < motorbikes.size(); i++){
            System.out.println(motorbikes.get(i));
        }
    }

    public static Motorbike createMotobike() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập biển số: ");
        String licensePlate = scanner.nextLine();

        System.out.print("Nhập hãng: ");
        String brand = scanner.nextLine();

        System.out.print("Nhập năm sản xuất: ");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập chủ sở hữu: ");
        String owner = scanner.nextLine();

        System.out.print("Nhập công suất: ");
        double capacity = Double.parseDouble(scanner.nextLine());

        Motorbike newMotorbike = new Motorbike(capacity, licensePlate, brand, year, owner);
        return newMotorbike;
    }
}
