package quan_ly_phuong_tien_giao_thong2.repository;

import quan_ly_phuong_tien_giao_thong2.entity.Truck;

import java.util.ArrayList;
import java.util.List;

public interface ITruckRepository {
    List<Truck> findAll();

    void add(Truck newTruck);

    void delete(Truck truck);
}
