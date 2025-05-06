package case_study.repository;

import case_study.entity.Facility;
import case_study.entity.House;

import java.util.List;
import java.util.Map;

public interface IHouseRepository {
    Map<House, Integer> findAll();
    void add(House house);

    void edit(Map.Entry<Facility, Integer> facilityEntry);
}
