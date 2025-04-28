package case_study.repository;

import case_study.entity.Villa;

import java.util.List;

public interface IVillaRepository {
    List<Villa> findAll();
}
