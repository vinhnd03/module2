package case_study.service;

import case_study.entity.Facility;

import java.util.Map;

public interface IFacilityService {
    Map<Facility, Integer> findAll();

    Facility findById(String id);

    Map<Facility, Integer> findAllMaintenance();
}
