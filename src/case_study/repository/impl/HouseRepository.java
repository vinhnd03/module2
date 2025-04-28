package case_study.repository.impl;

import case_study.entity.House;
import case_study.repository.IHouseRepository;

import java.util.List;

public class HouseRepository implements IHouseRepository {
    private static final String PATH = "src/case_study/data/house.csv";
    @Override
    public List<House> findAll() {
        return null;
    }
}
