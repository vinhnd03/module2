package quan_ly_phuong_tien_giao_thong.view;

import quan_ly_phuong_tien_giao_thong.entity.Car;
import quan_ly_phuong_tien_giao_thong.service.CarService;

import java.util.ArrayList;
import java.util.Scanner;

public class CarView {

    public static void displayCar(ArrayList<Car> cars) {
        System.out.println("Danh sách xe hơi");
        System.out.printf("%-15s| %-15s| %-10s| %-20s| %-10s| %-20s\n", "Biển số", "Hãng", "Năm sx", "Chủ sở hữu", "Số ghế", "Loại");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i).toString());
        }
    }

    public static Car creatCar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập biển số: ");
        String licensePlate = scanner.nextLine();

        System.out.print("Nhập hãng: ");
        String brand = scanner.nextLine();

        System.out.print("Nhập năm sản xuất: ");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập chủ sở hữu: ");
        String owner = scanner.nextLine();

        System.out.print("Nhập số lượng ghế: ");
        int numberOfSeats = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập loại xe: ");
        String type = scanner.nextLine();
        Car newCar = new Car(numberOfSeats, type, licensePlate, brand, year, owner);

        return newCar;
    }


}
