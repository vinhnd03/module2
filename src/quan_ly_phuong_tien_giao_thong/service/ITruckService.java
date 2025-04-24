package quan_ly_phuong_tien_giao_thong.service;

import quan_ly_phuong_tien_giao_thong.entity.Motorbike;
import quan_ly_phuong_tien_giao_thong.entity.Truck;

import java.util.ArrayList;
import java.util.List;

public interface ITruckService {
    List<Truck> findAll();

    void add(Truck newTruck);
}
