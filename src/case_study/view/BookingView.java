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
        System.out.print("Nhập id nhân viên: ");
        String customerId = scanner.nextLine();
        BookingController.displayServiceList();
        System.out.print("Nhập id dịch vụ: ");
        String serviceId = scanner.nextLine();
        return new Booking(id, date, startDate, endDate, customerId, serviceId);
    }

    public static void displayListBooking(List<Booking> bookings) {
        for (Booking booking : bookings){
            System.out.println(booking);
        }
    }
}
