package case_study.repository.impl;

import case_study.common.ReadAndWriteFile;
import case_study.entity.Room;
import case_study.repository.IRoomRepository;

import java.util.ArrayList;
import java.util.List;

public class RoomRepository implements IRoomRepository {
    private static final String PATH = "src/case_study/data/room.csv";
    @Override
    public List<Room> findAll() {
        List<Room> roomList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFileCSV(PATH);
        for(String s: stringList){
            String[] arr = s.split("\\s*,\\s*");
            roomList.add(new Room(arr[0], arr[1], Double.parseDouble(arr[2]), Long.parseLong(arr[3]),
                    Integer.parseInt(arr[4]), arr[5], arr[6]));
        }
        return roomList;
    }
}
