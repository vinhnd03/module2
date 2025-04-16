package quan_ly_phuong_tien_giao_thong.service;

import quan_ly_phuong_tien_giao_thong.entity.Motorbike;
import quan_ly_phuong_tien_giao_thong.entity.Truck;

import java.util.ArrayList;

public interface ITruckService {
    ArrayList<Truck> findAll();

    void add(Truck newTruck);
}
