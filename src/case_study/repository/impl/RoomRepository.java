package case_study.repository.impl;

import case_study.common.ReadAndWriteFile;
import case_study.entity.Facility;
import case_study.entity.House;
import case_study.entity.Room;
import case_study.repository.IRoomRepository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RoomRepository implements IRoomRepository {
    private static final String PATH = "src/case_study/data/room.csv";
    @Override
    public Map<Room, Integer> findAll() {
        Map<Room, Integer> roomMap = new LinkedHashMap<>();
        List<String> stringList = ReadAndWriteFile.readFileCSV(PATH);
        for(String s: stringList){
            String[] arr = s.split("\\s*,\\s*");
            roomMap.put(new Room(arr[0], arr[1], Double.parseDouble(arr[2]), Long.parseLong(arr[3]),
                    Integer.parseInt(arr[4]), arr[5], arr[6], Boolean.parseBoolean(arr[7])), Integer.parseInt(arr[8]));
        }
        return roomMap;
    }

    @Override
    public void add(Room room) {
        List<String> stringList = new ArrayList<>();
        stringList.add(room.infoToCSVFile() + ",0");
        ReadAndWriteFile.writeFileCSV(PATH, stringList, true);
    }

    @Override
    public void edit(Map.Entry<Facility, Integer> facilityEntry) {
        Map<Room, Integer> roomMap = findAll();
        roomMap.replace((Room) facilityEntry.getKey(), facilityEntry.getValue());
        List<String> stringList = new ArrayList<>();
        for(Map.Entry<Room, Integer> entry : roomMap.entrySet()){
            stringList.add(entry.getKey().infoToCSVFile() + "," + entry.getValue());
        }
        ReadAndWriteFile.writeFileCSV(PATH, stringList, false);
    }
}
