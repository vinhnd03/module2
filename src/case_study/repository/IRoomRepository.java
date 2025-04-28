package case_study.repository;

import case_study.entity.Room;

import java.util.List;

public interface IRoomRepository {
    List<Room> findAll();
}
