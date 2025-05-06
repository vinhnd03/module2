package case_study.controller;

import case_study.entity.*;
import case_study.service.impl.*;
import case_study.view.BookingView;
import case_study.view.ContractView;
import case_study.view.CustomerView;
import case_study.view.FacilityView;

import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class BookingController {
    private static Scanner scanner = new Scanner(System.in);
    private static BookingService bookingService = new BookingService();
    private static CustomerService customerService = new CustomerService();
    private static FacilityService facilityService = new FacilityService();
    private static ContractService contractService = new ContractService();
    public static void bookingMenu() {
        boolean loop = true;
        do {
            System.out.println("===========[Booking]==========");
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new contract");
            System.out.println("4. Display list contract");
            System.out.println("5. Edit contract");
            System.out.println("6. Return main menu");
            System.out.println("==============================");
            System.out.print("Your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("1. Add new booking");
                    addNewBooking();
                    break;
                case 2:
                    System.out.println("2. Display list booking");
                    displayListBooking();
                    break;
                case 3:
                    System.out.println("3. Create new contract");
                    createContract();
                    break;
                case 4:
                    System.out.println("4. Display list contract");
                    break;
                case 5:
                    System.out.println("5. Edit contract");
                    break;
                case 6:
                    loop = false;
                    break;
                default:
                    System.out.println("Invalid");
            }

        } while (loop);
    }

    private static void createContract() {
        System.out.println("Danh sách booking chờ xử lý: ");
        Queue<Booking> bookingQueue = bookingService.findIncompleteBooking();
        String firstBookingId = bookingQueue.peek().getId();
        BookingView.displayListBooking((List<Booking>) bookingQueue);
        System.out.println("Tạo hợp đồng với booking sớm nhất: ");
        Contract newContract = ContractView.inputContractInfo(firstBookingId);
        contractService.addContract(newContract);

    }

    private static void addNewBooking(){
        Booking booking = BookingView.inputBooking();
        bookingService.add(booking);
        System.out.println("Thêm thành công");
        /*
        * Room room = FacilityView.inputRoom();
                    RoomService.add(room);
                    System.out.println("Thêm thành công");
                    break;
        * */
    }

    private static void displayListBooking(){
        List<Booking> bookings = bookingService.findAll();
        BookingView.displayListBooking(bookings);
    }

    public static void displayCustomerList() {
        List<Customer> customers = customerService.findAll();
        CustomerView.displayList(customers);
    }

    public static void displayServiceList() {
        Map<Facility, Integer> facilityList =  facilityService.findAll();
        FacilityView.displayRoomList(facilityList);
    }
}
