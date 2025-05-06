package case_study.service.impl;

import case_study.entity.Villa;
import case_study.repository.IVillaRepository;
import case_study.repository.impl.VillaRepository;
import case_study.service.IVillaService;

public class VillaService implements IVillaService {
    private IVillaRepository repository = new VillaRepository();

    @Override
    public void add(Villa villa) {
        repository.add(villa);
    }
}
