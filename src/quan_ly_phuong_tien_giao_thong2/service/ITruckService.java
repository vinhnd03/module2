package quan_ly_phuong_tien_giao_thong2.service;

import quan_ly_phuong_tien_giao_thong2.entity.Motorbike;
import quan_ly_phuong_tien_giao_thong2.entity.Truck;

import java.util.ArrayList;
import java.util.List;

public interface ITruckService {
    List<Truck> findAll();

    void add(Truck newTruck);
}
