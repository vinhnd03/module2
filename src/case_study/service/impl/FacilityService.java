package case_study.service.impl;

import case_study.repository.IFacilityRepository;
import case_study.repository.impl.FacilityRepository;
import case_study.service.IFacilityService;

public class FacilityService implements IFacilityService {
    private IFacilityRepository repository = new FacilityRepository();
}
