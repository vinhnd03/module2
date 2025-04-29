package case_study.repository.impl;

import case_study.entity.Facility;
import case_study.entity.House;
import case_study.entity.Room;
import case_study.entity.Villa;
import case_study.repository.IFacilityRepository;
import case_study.repository.IHouseRepository;
import case_study.repository.IRoomRepository;
import case_study.repository.IVillaRepository;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    private static IRoomRepository roomRepository = new RoomRepository();
    private static IVillaRepository villaRepository = new VillaRepository();
    private static IHouseRepository houseRepository = new HouseRepository();
    //private static Map<Facility, Integer> facilityMap = new LinkedHashMap<>();

    private static Map<Facility, Integer> getFacilityMap (){
        Map<Facility, Integer> facilityMap = new LinkedHashMap<>();
        List<House> houseList = houseRepository.findAll();
        List<Room> roomList = roomRepository.findAll();
        List<Villa> villaList = villaRepository.findAll();
        for(House house : houseList){
            facilityMap.put(house, 0);
        }
        for(Room room: roomList){
            facilityMap.put(room, 0);
        }
        for(Villa villa: villaList){
            facilityMap.put(villa, 0);
        }
        return facilityMap;
    }

    @Override
    public Map<Facility, Integer> findAll() {
        return getFacilityMap();
    }
}
