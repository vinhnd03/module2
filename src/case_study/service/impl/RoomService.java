package case_study.service.impl;

import case_study.repository.IRoomRepository;
import case_study.repository.impl.RoomRepository;
import case_study.service.IRoomService;

public class RoomService implements IRoomService {
    private IRoomRepository repository = new RoomRepository();
}
