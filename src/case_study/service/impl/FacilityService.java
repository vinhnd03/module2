package case_study.service.impl;

import case_study.entity.Facility;
import case_study.repository.IFacilityRepository;
import case_study.repository.impl.FacilityRepository;
import case_study.service.IFacilityService;

import java.util.Map;

public class FacilityService implements IFacilityService {
    private IFacilityRepository repository = new FacilityRepository();

    @Override
    public Map<Facility, Integer> findAll() {
        return repository.findAll();
    }
}
