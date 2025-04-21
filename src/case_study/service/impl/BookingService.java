package case_study.service.impl;

import case_study.repository.IBookingRepository;
import case_study.repository.impl.BookingRepository;
import case_study.service.IBookingService;

public class BookingService implements IBookingService {
    private IBookingRepository repository = new BookingRepository();
}
