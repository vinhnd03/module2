package case_study.service.impl;

import case_study.entity.Room;
import case_study.repository.IRoomRepository;
import case_study.repository.impl.RoomRepository;
import case_study.service.IRoomService;

import java.util.List;
import java.util.Map;

public class RoomService implements IRoomService {
    private IRoomRepository repository = new RoomRepository();

    @Override
    public void add(Room room) {
        repository.add(room);
    }

    @Override
    public Map<Room, Integer> findAll() {
        return repository.findAll();
    }
}
