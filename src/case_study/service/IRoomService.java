package case_study.service;

import case_study.entity.Room;

import java.util.List;
import java.util.Map;

public interface IRoomService {
    void add(Room room);

    Map<Room, Integer> findAll();
}
