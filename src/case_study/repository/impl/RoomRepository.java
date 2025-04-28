package case_study.repository.impl;

import case_study.entity.Room;
import case_study.repository.IRoomRepository;

import java.util.List;

public class RoomRepository implements IRoomRepository {
    private static final String PATH = "src/case_study/data/room.csv";
    @Override
    public List<Room> findAll() {
        return null;
    }
}
