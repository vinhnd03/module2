package case_study.repository;

import case_study.entity.House;

import java.util.List;

public interface IHouseRepository {
    List<House> findAll();
    void add(House house);
}
