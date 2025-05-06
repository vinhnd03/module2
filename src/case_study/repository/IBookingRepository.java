package case_study.repository;

import case_study.entity.Booking;

import java.util.List;
import java.util.Queue;

public interface IBookingRepository {
    void add(Booking booking);

    List<Booking> findAll();

    Queue<Booking> findIncompleteBooking();
}
