package case_study.repository.impl;

import case_study.entity.Villa;
import case_study.repository.IVillaRepository;

import java.util.List;

public class VillaRepository implements IVillaRepository {
    private static final String PATH = "src/case_study/data/villa.csv";
    @Override
    public List<Villa> findAll() {
        return null;
    }
}
