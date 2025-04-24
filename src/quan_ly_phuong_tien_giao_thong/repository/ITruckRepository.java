package quan_ly_phuong_tien_giao_thong.repository;

import quan_ly_phuong_tien_giao_thong.entity.Truck;

import java.util.ArrayList;
import java.util.List;

public interface ITruckRepository {
    List<Truck> findAll();

    void add(Truck newTruck);

    void delete(Truck truck);
}
