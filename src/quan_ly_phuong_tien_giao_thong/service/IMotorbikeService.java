package quan_ly_phuong_tien_giao_thong.service;

import quan_ly_phuong_tien_giao_thong.entity.Motorbike;

import java.util.ArrayList;

public interface IMotorbikeService {
    ArrayList<Motorbike> findAll();

    void add(Motorbike newMotorbike);
}
