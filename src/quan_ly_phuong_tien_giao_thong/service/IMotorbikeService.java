package quan_ly_phuong_tien_giao_thong.service;

import quan_ly_phuong_tien_giao_thong.entity.Motorbike;

import java.util.ArrayList;
import java.util.List;

public interface IMotorbikeService {
    List<Motorbike> findAll();

    void add(Motorbike newMotorbike);
}
