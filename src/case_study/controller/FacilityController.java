package case_study.controller;

import case_study.entity.Facility;
import case_study.entity.House;
import case_study.entity.Room;
import case_study.entity.Villa;
import case_study.service.IRoomService;
import case_study.service.impl.FacilityService;
import case_study.service.impl.HouseService;
import case_study.service.impl.RoomService;
import case_study.service.impl.VillaService;
import case_study.view.FacilityView;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FacilityController {
    private static Scanner scanner = new Scanner(System.in);
    private static FacilityService facilityservice = new FacilityService();
    private static HouseService houseService = new HouseService();
    private static RoomService RoomService = new RoomService();
    private static VillaService villaService = new VillaService();

    public static void facilityMenu() {

        boolean loop = true;
        do {
            System.out.println("==========[Dịch vụ]=========");
            System.out.println("1. Danh sách dịch vụ");
            System.out.println("2. Thêm dịch vụ mới");
            System.out.println("3. Danh sách dịch vụ bảo trì");
            System.out.println("4. Trờ về menu chính");
            System.out.println("=============================");
            System.out.print("Lựa chọn: ");
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("1. Danh sách dịch vụ");
                        displayList();
                        break;
                    case 2:
                        System.out.println("2. Thêm dịch vụ mới");
                        add();
                        break;
                    case 3:
                        System.out.println("3. Danh sách dịch vụ bảo trì");
                        displayMaintenanceList();
                        break;
                    case 4:
                        loop = false;
                        break;
                    default:
                        System.out.println("Không hợp lệ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Sai định dạng số");
            }
        } while (loop);
    }

    private static void displayList() {
        Map<Facility, Integer> facilityMap = facilityservice.findAll();
        FacilityView.displayFacilityList(facilityMap);
    }


    private static void add() {
        boolean loop = true;
        do {
            System.out.println("==========[Thêm mới]=========");
            System.out.println("1. New House");
            System.out.println("2. New Room");
            System.out.println("3. New Villa");
            System.out.println("4. Trở về");
            System.out.println("=================================");
            System.out.print("Lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    House house = FacilityView.inputHouse();
                    houseService.add(house);
                    System.out.println("Thêm thành công");
                    break;
                case 2:
                    Room room = FacilityView.inputRoom();
                    RoomService.add(room);
                    System.out.println("Thêm thành công");
                    break;
                case 3:
                    Villa villa = FacilityView.inputVilla();
                    villaService.add(villa);
                    System.out.println("Thêm thành công");
                    break;
                case 4:
                    loop = false;
                    break;
                default:
                    System.out.println("Không hợp lệ");
            }

        } while (loop);
    }

    private static void displayMaintenanceList() {
        Map<Facility, Integer> facilityMap = facilityservice.findAllMaintenance();
        FacilityView.displayFacilityList(facilityMap);
    }
}
