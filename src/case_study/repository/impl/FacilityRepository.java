package case_study.repository.impl;

import case_study.common.ReadAndWriteFile;
import case_study.entity.Booking;
import case_study.entity.Facility;
import case_study.entity.House;
import case_study.entity.Room;
import case_study.repository.*;

import java.util.*;

public class FacilityRepository implements IFacilityRepository {
    private static IRoomRepository roomRepository = new RoomRepository();
    private static IVillaRepository villaRepository = new VillaRepository();
    private static IHouseRepository houseRepository = new HouseRepository();
    private static IBookingRepository bookingRepository = new BookingRepository();

    private static Map<Facility, Integer> getFacilityMap() {
        Map<Facility, Integer> facilityMap = new LinkedHashMap<>();
        facilityMap.putAll(houseRepository.findAll());
        facilityMap.putAll(roomRepository.findAll());
        facilityMap.putAll(villaRepository.findAll());
        return facilityMap;
    }

    private boolean checkBookingFacility(Facility facility){
        List<Booking> bookings = bookingRepository.findAll();
        for (Booking booking : bookings){
            if(booking.getServiceId().equals(facility.getId())){
                return true;
            }
        }
        return false;
    }

    @Override
    public Map<Facility, Integer> findAll() {
        return getFacilityMap();
    }

    public Map.Entry<Facility, Integer> findMapByKey(Facility facility) {
        for (Map.Entry<Facility, Integer> entry : findAll().entrySet()) {
            if (entry.getKey().equals(facility)) {
                return entry;
            }
        }
        return null;
    }

    @Override
    public void editMap(Map.Entry<Facility, Integer> facilityEntry) {
        if(facilityEntry.getKey() instanceof House){
            houseRepository.edit(facilityEntry);
        }else if(facilityEntry.getKey() instanceof Room){
            roomRepository.edit(facilityEntry);
        }else {
            villaRepository.edit(facilityEntry);
        }

    }

    @Override
    public Map<Facility, Integer> findAllAvailableFacility() {
        Map<Facility, Integer> availableFacilityMap = new LinkedHashMap<>();
        for (Map.Entry<Facility, Integer> entry : findAll().entrySet()){
            if(!entry.getKey().isMaintenance() && !checkBookingFacility(entry.getKey())){
                availableFacilityMap.put(entry.getKey(), entry.getValue());
            }
        }
        return availableFacilityMap;
    }

    @Override
    public Facility findById(String id) {
        for (Map.Entry<Facility, Integer> entry : findAll().entrySet()) {
            if (entry.getKey().getId().equals(id)) {
                return entry.getKey();
            }
        }
        return null;
    }

    @Override
    public Map<Facility, Integer> findAllMaintenance() {
        Map<Facility, Integer> facilityMap = findAll();
        Map<Facility, Integer> maintenanceMap = new LinkedHashMap<>();
        for (Map.Entry<Facility, Integer> entry : facilityMap.entrySet()) {
            if (entry.getKey().isMaintenance()) {
                maintenanceMap.put(entry.getKey(), entry.getValue());
            }
        }
        return maintenanceMap;
    }
}
