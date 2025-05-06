package case_study.repository;

import case_study.entity.Villa;

import java.util.List;
import java.util.Map;

public interface IVillaRepository {
    Map<Villa, Integer> findAll();
    void add(Villa villa);
}
