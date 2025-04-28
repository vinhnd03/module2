package case_study.repository;

import case_study.entity.Facility;

import java.util.Map;

public interface IFacilityRepository {
    Map<Facility, Integer> findAll();
}
