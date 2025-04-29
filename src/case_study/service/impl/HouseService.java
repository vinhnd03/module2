package case_study.service.impl;

import case_study.entity.House;
import case_study.repository.IHouseRepository;
import case_study.repository.impl.HouseRepository;
import case_study.service.IHouseService;

public class HouseService implements IHouseService {
    private IHouseRepository repository = new HouseRepository();

    @Override
    public void add(House house) {
        repository.add(house);
    }
}
