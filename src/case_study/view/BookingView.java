package case_study.view;

import case_study.common.ValidateInput;
import case_study.controller.BookingController;
import case_study.entity.Booking;

import java.util.List;
import java.util.Scanner;

public class BookingView {
    private static Scanner scanner = new Scanner(System.in);

    public static Booking inputBooking() {
        String id = ValidateInput.inputBookingId();
        String date = ValidateInput.inputDate("ngày đặt");
        String startDate = ValidateInput.inputDate("ngày bắt đầu");
        String endDate = ValidateInput.inputDate("ngày kết thúc");
        BookingController.displayCustomerList();
        System.out.print("Nhập id khách hàng: ");
        String customerId = scanner.nextLine();
        while (!BookingController.checkCustomerId(customerId)){
            System.out.println("Khách hàng không tồn tại");
            System.out.print("Nhập lại id khách hàng: ");
            customerId = scanner.nextLine();
        }
        BookingController.displayServiceList();
        System.out.print("Nhập id dịch vụ: ");
        String serviceId = scanner.nextLine();
        while (!BookingController.checkServiceId(serviceId)){
            System.out.print("Nhập id dịch vụ: ");
            serviceId = scanner.nextLine();
        }
        return new Booking(id, date, startDate, endDate, customerId, serviceId);
    }

    public static void displayListBooking(List<Booking> bookings) {
        System.out.printf("%-7s | %-10s | %-12s | %-14s | %-15s | %-10s | %-10s \n",
                "ID", "Ngày tạo", "Ngày bắt đầu", "Ngày kết thúc", "ID khách hàng", "ID dịch vụ", "Trạng thái");
        for (Booking booking : bookings){
//            System.out.println(booking);
            System.out.printf("%-7s | %-10s | %-12s | %-14s | %-15s | %-10s | %-10s \n",
                    booking.getId(), booking.getDate(), booking.getStartDate(), booking.getEndDate(),
                    booking.getCustomerId(), booking.getServiceId(), booking.isComplete() ? "Đã thành thành" : "Chưa hoàn thành");
        }
    }
}
