package quan_ly_phuong_tien_giao_thong2.repository;

import quan_ly_phuong_tien_giao_thong2.entity.Car;

import java.util.ArrayList;
import java.util.List;

public interface ICarRepository {
    List<Car> findAll();

    void add(Car newCar);

    void delete(Car car);
}
