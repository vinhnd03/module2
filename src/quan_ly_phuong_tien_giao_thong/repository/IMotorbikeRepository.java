package quan_ly_phuong_tien_giao_thong.repository;

import quan_ly_phuong_tien_giao_thong.entity.Motorbike;

import java.util.ArrayList;
import java.util.List;

public interface IMotorbikeRepository {
    List<Motorbike> findAll();

    void add(Motorbike newMotorbike);

    void delete(Motorbike motorbike);
}
