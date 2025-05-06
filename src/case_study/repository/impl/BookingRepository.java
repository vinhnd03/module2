package case_study.repository.impl;

import case_study.common.ReadAndWriteFile;
import case_study.entity.Booking;
import case_study.entity.Facility;
import case_study.repository.IBookingRepository;
import case_study.repository.IFacilityRepository;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BookingRepository implements IBookingRepository {
    private final String PATH = "src/case_study/data/booking.csv";
    private static IFacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public void add(Booking booking) {
        List<String> stringList = new ArrayList<>();
        stringList.add(booking.infoToCSVFile());
        Facility facility = facilityRepository.findById(booking.getServiceId());
        Map.Entry<Facility, Integer> entry = facilityRepository.findMapByKey(facility);
        entry.setValue(entry.getValue() + 1);
        facilityRepository.editMap(entry);
        ReadAndWriteFile.writeFileCSV(PATH, stringList, true);
    }

    public List<Booking> findAll() {
        List<Booking> bookings = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFileCSV(PATH);
        for (String s : stringList) {
            String[] arr = s.split("\\s*,\\s*");
            bookings.add(new Booking(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], Boolean.parseBoolean(arr[6])));
        }
        Collections.sort(bookings, new Comparator<Booking>() {
            @Override
            public int compare(Booking o1, Booking o2) {
                LocalDate date1 = convertToDate(o1.getDate());
                LocalDate date2 = convertToDate(o2.getDate());
                if(date1.compareTo(date2) == 0){
                    LocalDate endDate1 = convertToDate(o1.getEndDate());
                    LocalDate endDate2 = convertToDate(o2.getEndDate());
                    return endDate1.compareTo(endDate2);
                }
                return date1.compareTo(date2);
            }
        });
        return bookings;
    }

    public Queue<Booking> findIncompleteBooking(){
        Queue<Booking> bookingQueue = new LinkedList<>();
        List<Booking> bookingList = findAll();
        for(Booking b : bookingList){
            if(!b.isComplete()){
                bookingQueue.offer(b);
            }
        }
        return bookingQueue;
    }

    private LocalDate convertToDate(String dateStr){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try {
            return LocalDate.parse(dateStr, formatter);
        } catch (DateTimeException e) {
            e.printStackTrace();
            return null;
        }
    }
}
