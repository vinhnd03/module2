package quan_ly_phuong_tien_giao_thong.service;

import quan_ly_phuong_tien_giao_thong.entity.Car;

import java.util.ArrayList;

public interface ICarService {
    ArrayList<Car> findAll();

    void add(Car newCar);

}
