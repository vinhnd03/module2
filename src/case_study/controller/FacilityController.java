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
            System.out.println("==========[Facility]=========");
            System.out.println("1. Display list facilities");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
            System.out.println("=============================");
            System.out.print("Your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("1. Display list facilities");
                    displayList();
                    break;
                case 2:
                    System.out.println("2. Add new facility");
                    add();
                    break;
                case 3:
                    System.out.println("3. Display list facility maintenance");
                    displayMaintenanceList();
                    break;
                case 4:
                    loop = false;
                    break;
                default:
                    System.out.println("Invalid");
            }

        } while (loop);
    }

    private static void displayList(){
        Map<Facility, Integer> facilityMap = facilityservice.findAll();
        FacilityView.displayFacilityList(facilityMap);
    }



    private static void add(){
        boolean loop = true;
        do {
            System.out.println("==========[Add Facility]=========");
            System.out.println("1. New House");
            System.out.println("2. New Room");
            System.out.println("3. New Villa");
            System.out.println("4. Return");
            System.out.println("=================================");
            System.out.print("Your choice: ");
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
                    System.out.println("Invalid");
            }

        } while (loop);
    }

    private static void displayMaintenanceList(){
        Map<Facility, Integer> facilityMap = facilityservice.findAllMaintenance();
        FacilityView.displayFacilityList(facilityMap);
    }
}
