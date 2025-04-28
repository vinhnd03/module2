package case_study.controller;

import case_study.entity.Facility;
import case_study.service.impl.FacilityService;
import case_study.view.FacilityView;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FacilityController {
    private static Scanner scanner = new Scanner(System.in);
    private static FacilityService facilityservice = new FacilityService();

    public static void facilityMenu() {
        boolean loop = true;
        do {
            System.out.println("==========[Facility]=========");
            System.out.println("1. Display list facilities");
            System.out.println("2. Add new facility");
            System.out.println("3. Edit facility");
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
                    break;
                case 3:
                    System.out.println("3. Edit facility");
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
//        Map<Facility, Integer> facilityMap = facilityservice.findAll();
//        FacilityView.displayFacilityList();
    }
}
