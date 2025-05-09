package quan_ly_phuong_tien_giao_thong2.view;

import quan_ly_phuong_tien_giao_thong2.entity.Truck;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruckView {

    public static void displayTruck(List<Truck> trucks ){

        System.out.println("Danh sách xe tải");
        System.out.printf("%-15s| %-15s| %-10s| %-20s| %-10s\n", "Biển số", "Hãng", "Năm sx", "Chủ sở hữu", "Tải trọng");
        for (int i = 0; i < trucks.size(); i++){
            System.out.println(trucks.get(i));
        }
    }

    public static Truck createTruck() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập biển số: ");
        String licensePlate = scanner.nextLine();

        System.out.print("Nhập hãng: ");
        String brand = scanner.nextLine();

        System.out.print("Nhập năm sản xuất: ");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập chủ sở hữu: ");
        String owner = scanner.nextLine();

        System.out.print("Nhập trọng tải: ");
        double payLoad = Double.parseDouble(scanner.nextLine());

        Truck newTruck = new Truck(payLoad, licensePlate, brand, year, owner);
        return newTruck;
    }
}
