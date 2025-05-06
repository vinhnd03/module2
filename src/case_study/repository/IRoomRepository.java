package case_study.repository;

import case_study.entity.Facility;
import case_study.entity.Room;

import java.util.List;
import java.util.Map;

public interface IRoomRepository {
    Map<Room, Integer> findAll();
    void add(Room room);

    void edit(Map.Entry<Facility, Integer> facilityEntry);
}
