package case_study.repository;

import case_study.entity.Facility;

import java.util.Map;

public interface IFacilityRepository {
    Map<Facility, Integer> findAll();

    Facility findById(String id);

    Map<Facility, Integer> findAllMaintenance();

    Map.Entry<Facility, Integer> findMapByKey(Facility facility);

    void editMap(Map.Entry<Facility, Integer> facility);
}
