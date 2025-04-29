package case_study.view;

import case_study.common.ValidateInput;
import case_study.entity.Facility;
import case_study.entity.House;

import java.util.Map;
import java.util.Scanner;

public class FacilityView {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayFacilityList(Map<Facility, Integer> facilityMap) {
        for(Map.Entry<Facility, Integer> entry: facilityMap.entrySet()){
            System.out.println(entry.getKey());
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
}
