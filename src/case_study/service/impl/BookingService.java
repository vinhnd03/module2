package case_study.service.impl;

import case_study.entity.Booking;
import case_study.repository.IBookingRepository;
import case_study.repository.impl.BookingRepository;
import case_study.service.IBookingService;

import java.util.List;
import java.util.Queue;

public class BookingService implements IBookingService {
    private IBookingRepository repository = new BookingRepository();

    @Override
    public void add(Booking booking) {
        repository.add(booking);
    }

    @Override
    public List<Booking> findAll() {
        return repository.findAll();
    }

    @Override
    public Queue<Booking> findIncompleteBooking() {
        return repository.findIncompleteBooking();
    }
}
