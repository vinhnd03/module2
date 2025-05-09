package quan_ly_phuong_tien_giao_thong2.controller;

import quan_ly_phuong_tien_giao_thong2.entity.Car;
import quan_ly_phuong_tien_giao_thong2.entity.Motorbike;
import quan_ly_phuong_tien_giao_thong2.entity.Truck;
import quan_ly_phuong_tien_giao_thong2.entity.Vehicle;
import quan_ly_phuong_tien_giao_thong2.service.CarService;
import quan_ly_phuong_tien_giao_thong2.service.MotorbikeService;
import quan_ly_phuong_tien_giao_thong2.service.TruckService;
import quan_ly_phuong_tien_giao_thong2.service.VehicleService;
import quan_ly_phuong_tien_giao_thong2.view.CarView;
import quan_ly_phuong_tien_giao_thong2.view.MotorbikeView;
import quan_ly_phuong_tien_giao_thong2.view.TruckView;
import quan_ly_phuong_tien_giao_thong2.view.VehicleView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleController {
    private static CarService carService = new CarService();
    private static TruckService truckService = new TruckService();
    private static MotorbikeService motorbikeService = new MotorbikeService();
    private static VehicleService vehicleService = new VehicleService();

    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println();
            System.out.println("========== [ Quản lý phương tiện ] ===========");
            System.out.println("1. Thêm mới phương tiện");
            System.out.println("2. Hiển thị phương tiện");
            System.out.println("3. Xóa phương tiện");
            System.out.println("4. Thoát");
            System.out.println("==============================================");
            System.out.print("Lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    chooseAdd();
                    break;
                case 2:
                    chooseDisplay();
                    break;
                case 3:
                    chooseDelete();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }
        } while (flag);
    }

    private static void chooseDisplay() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("========== [ Hiển thị ] ==========");
            System.out.println("1. Xe hơi");
            System.out.println("2. Xe tải");
            System.out.println("3. Xe máy");
            System.out.println("4. Thoát");
            System.out.println("==================================");
            System.out.print("Lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    List<Car> cars = carService.findAll();
                    CarView.displayCar(cars);
                    break;
                case 2:
                    List<Truck> trucks = truckService.findAll();
                    TruckView.displayTruck(trucks);
                    break;
                case 3:
                    List<Motorbike> motorbikes = motorbikeService.findAll();
                    MotorbikeView.displayMotorbike(motorbikes);
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }
        } while (flag);
    }

    private static void chooseAdd() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("========== [ Thêm mới ] ==========");
            System.out.println("1. Xe hơi");
            System.out.println("2. Xe tải");
            System.out.println("3. Xe máy");
            System.out.println("4. Thoát");
            System.out.println("===================================");
            System.out.print("Lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    Car car = CarView.creatCar();
                    carService.add(car);
                    System.out.println("Thêm mới thành công!");
                    break;
                case 2:
                    Truck truck = TruckView.createTruck();
                    truckService.add(truck);
                    System.out.println("Thêm mới thành công!");
                    break;
                case 3:
                    Motorbike motorbike = MotorbikeView.createMotobike();
                    motorbikeService.add(motorbike);
                    System.out.println("Thêm mới thành công!");
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }
        } while (flag);
    }

    private static void chooseDelete() {
        String licensePlate = VehicleView.inputLicensePlate();
        Vehicle vehicle = vehicleService.findByLicensePlate(licensePlate);
//        String id = "test";
//        vehicle.findById(id);
        if(vehicle != null){
            boolean permission = VehicleView.confirm();
            if(permission){
                vehicleService.delete(vehicle);
                System.out.println("Xóa thành công!");
            }else{
                System.out.println("Đã hủy!");
            }


        }else {
            System.out.println("Không tìm thấy xe muốn xóa!");
        }
    }
}
