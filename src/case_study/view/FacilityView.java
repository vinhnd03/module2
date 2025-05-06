package case_study.view;

import case_study.common.ValidateInput;
import case_study.entity.Facility;
import case_study.entity.House;
import case_study.entity.Room;
import case_study.entity.Villa;

import java.util.Map;
import java.util.Scanner;

public class FacilityView {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayFacilityList(Map<Facility, Integer> facilityMap) {
        for(Map.Entry<Facility, Integer> entry: facilityMap.entrySet()){
            System.out.println(entry.getKey() + ", usage: " + entry.getValue());
        }
    }

    public static House inputHouse() {
        String id = ValidateInput.inputHouseId();
        String name = ValidateInput.inputServiceName();
        double area = ValidateInput.inputArea();
        long price = ValidateInput.inputPrice();
        int max = ValidateInput.inputMaxPeople();
        System.out.print("Nhập loại thuê: ");
        String type = scanner.nextLine();
        System.out.print("Nhập tiêu chuẩn phòng: ");
        String standard = scanner.nextLine();
        int numberOfFloors = ValidateInput.inputNumberOfFloors();
        return new House(id, name, area, price, max, type, standard, numberOfFloors);
    }

    public static Room inputRoom() {
        String id = ValidateInput.inputRoomId();
        String name = ValidateInput.inputServiceName();
        double area = ValidateInput.inputArea();
        long price = ValidateInput.inputPrice();
        int max = ValidateInput.inputMaxPeople();
        System.out.print("Nhập loại thuê: ");
        String type = scanner.nextLine();
        System.out.print("Nhập dịch vụ miễn phí: ");
        String freeService = scanner.nextLine();
        return new Room(id, name, area, price, max, type, freeService);
    }

    public static Villa inputVilla() {
        String id = ValidateInput.inputVillaId();
        String name = ValidateInput.inputServiceName();
        double area = ValidateInput.inputArea();
        long price = ValidateInput.inputPrice();
        int max = ValidateInput.inputMaxPeople();
        System.out.print("Nhập loại thuê: ");
        String type = scanner.nextLine();
        System.out.print("Nhập tiêu chuẩn phòng" );
        String standard = scanner.nextLine();
        double poolArea = ValidateInput.inputPoolArea();
        int numberOfFloors = ValidateInput.inputNumberOfFloors();
        return new Villa(id, name, area, price, max, type, standard, poolArea, numberOfFloors);
    }

    public static String inputEditFacility() {
        System.out.print("Nhập id của dịch vụ muốn cập nhật: ");
        return scanner.nextLine();
    }

    public static void displayRoomList(Map<Facility, Integer> facilityIntegerMap) {
        for(Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()){
            System.out.println(entry.getKey());
        }
    }
}
