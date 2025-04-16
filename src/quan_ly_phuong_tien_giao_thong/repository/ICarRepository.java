package quan_ly_phuong_tien_giao_thong.repository;

import quan_ly_phuong_tien_giao_thong.entity.Car;

import java.util.ArrayList;

public interface ICarRepository {
    ArrayList<Car> findAll();

    void add(Car newCar);

    void delete(Car car);
}
