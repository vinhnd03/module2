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
        System.out.printf("%-10s | %-7s | %-17s | %-10s | %-10s | %-10s | %-10s | %-20s | %-10s | %-20s | %-15s | %-15s\n",
                "ID", "Loại", "Tên dịch vụ", "Diện tích", "Giá", "Tối đa", "Kiểu thuê", "Tiêu chuẩn phòng", "Số tầng",
                "Dịch vụ miễn phí", "Diện tích hồ", "Số lần sử dụng");
        for (Map.Entry<Facility, Integer> entry : facilityMap.entrySet()) {
            //System.out.println(entry.getKey() + ", usage: " + entry.getValue());
            Facility facility = entry.getKey();
            if(entry.getKey() instanceof House){
                House h = (House) facility;
                System.out.printf("%-10s | %-7s | %-17s | %-10f | %-10d | %-10d | %-10s | %-20s | %-10d | %-20s | %-15s | %-15d\n",
                        h.getId(), "House", h.getName(), h.getArea(), h.getPrice(), h.getMax(), h.getType(), h.getRoomStandard(),
                        h.getNumberOfFloors(), "--------", "---------", entry.getValue());
            }else if(entry.getKey() instanceof Room){
                Room r = (Room) facility;
                System.out.printf("%-10s | %-7s | %-17s | %-10f | %-10d | %-10d | %-10s | %-20s | %-10s | %-20s | %-15s | %-15d\n",
                        r.getId(), "House", r.getName(), r.getArea(), r.getPrice(), r.getMax(), r.getType(), "--------",
                        "--------", r.getFreeService(), "---------", entry.getValue());
            }else{
                Villa v = (Villa) facility;
                System.out.printf("%-10s | %-7s | %-17s | %-10f | %-10d | %-10d | %-10s | %-20s | %-10d | %-20s | %-15f | %-15d\n",
                        v.getId(), "House", v.getName(), v.getArea(), v.getPrice(), v.getMax(), v.getType(), v.getRoomStandard(),
                        v.getNumberOfFloors(), "--------", v.getPoolArea(), entry.getValue());
            }
        }
    }

    public static House inputHouse() {
        String id = ValidateInput.inputHouseId();
        String name = ValidateInput.inputServiceName();
        double area = ValidateInput.inputArea();
        long price = ValidateInput.inputPrice();
        int max = ValidateInput.inputMaxPeople();
        String type = ValidateInput.inputRentType();
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
        String type = ValidateInput.inputRentType();
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
        String type = ValidateInput.inputRentType();
        System.out.print("Nhập tiêu chuẩn phòng");
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
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            System.out.println(entry.getKey());
        }
    }

    public static int selectRentType() {
        System.out.println("Chọn kiểu thuê: ");
        System.out.println("1. Theo giờ");
        System.out.println("2. Theo ngày");
        System.out.println("3. Theo tháng");
        System.out.println("4. Theo năm");
        System.out.print("Chọn: ");
        return Integer.parseInt(scanner.nextLine());
    }
}
