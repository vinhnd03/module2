package case_study.service;

import case_study.entity.Booking;

import java.util.List;
import java.util.Queue;

public interface IBookingService {
    void add(Booking booking);

    List<Booking> findAll();

    Queue<Booking> findIncompleteBooking();

    Booking findById(String id);
}
