package case_study.controller;

import case_study.entity.*;
import case_study.service.impl.*;
import case_study.view.BookingView;
import case_study.view.ContractView;
import case_study.view.CustomerView;
import case_study.view.FacilityView;

import java.util.*;

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
            System.out.println("1. Thêm mới booking");
            System.out.println("2. Danh sách booking");
            System.out.println("3. Tạo hợp đồng mới");
            System.out.println("4. Danh sách hợp đồng");
            System.out.println("5. Chỉnh sửa hợp đồng");
            System.out.println("6. Trở về menu chính");
            System.out.println("==============================");
            System.out.print("Lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("1. Thêm mới booking");
                    addNewBooking();
                    break;
                case 2:
                    System.out.println("2. Danh sách booking");
                    displayListBooking();
                    break;
                case 3:
                    System.out.println("3. Tạo hợp đồng mới");
                    createContract();
                    break;
                case 4:
                    System.out.println("4. Danh sách hợp đồng");
                    displayContractList();
                    break;
                case 5:
                    System.out.println("5. Chỉnh sửa hợp đồng");
                    editContract();
                    break;
                case 6:
                    loop = false;
                    break;
                default:
                    System.out.println("Không hợp lệ");
            }

        } while (loop);
    }

    private static void editContract() {
        System.out.println("Danh sách hợp đồng: ");
        displayContractList();
        int contractNumber = ContractView.inputContractNumber();
        Contract contract = contractService.findByContractNumber(contractNumber);
        if(contract == null){
            System.out.println("Hợp đồng không tồn tại");
            return;
        }
        ContractView.editContract(contract);
        contractService.edit(contract);
        System.out.println("Cập nhật thành công");
    }

    private static void displayContractList() {
        Set<Contract> contractSet = contractService.findAll();
        ContractView.displayContractList(contractSet);
    }

    private static void createContract() {
        System.out.println("Danh sách booking chờ xử lý: ");
        Queue<Booking> bookingQueue = bookingService.findIncompleteBooking();
        String firstBookingId = bookingQueue.peek().getId();
        BookingView.displayListBooking((List<Booking>) bookingQueue);
        System.out.println("Tạo hợp đồng với booking sớm nhất: ");
        Contract newContract = ContractView.inputContractInfo(firstBookingId);
        contractService.addContract(newContract);
        System.out.println("Thêm mới thành công");
    }

    private static void addNewBooking(){
        Booking booking = BookingView.inputBooking();
        bookingService.add(booking);
        System.out.println("Thêm thành công");
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
        Map<Facility, Integer> facilityList = facilityService.findAllAvailableFacility();
        FacilityView.displayRoomList(facilityList);
    }

    public static boolean checkCustomerId(String customerId) {
        Customer customer = customerService.findById(customerId);
        if(customer != null){
            return true;
        }
        return false;
    }

    public static boolean checkServiceId(String serviceId) {
        Facility facility = facilityService.findById(serviceId);
        if(facility != null){
            return true;
        }
        return false;
    }
}
