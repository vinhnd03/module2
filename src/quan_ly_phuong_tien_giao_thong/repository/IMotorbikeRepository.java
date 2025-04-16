package quan_ly_phuong_tien_giao_thong.repository;

import quan_ly_phuong_tien_giao_thong.entity.Motorbike;

import java.util.ArrayList;

public interface IMotorbikeRepository {
    ArrayList<Motorbike> findAll();

    void add(Motorbike newMotorbike);

    void delete(Motorbike motorbike);
}
