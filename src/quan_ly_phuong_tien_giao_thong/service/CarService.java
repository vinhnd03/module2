package quan_ly_phuong_tien_giao_thong.service;

import quan_ly_phuong_tien_giao_thong.entity.Car;
import quan_ly_phuong_tien_giao_thong.repository.CarRepository;
import quan_ly_phuong_tien_giao_thong.repository.ICarRepository;

import java.util.ArrayList;
import java.util.List;

public class CarService implements ICarService{
    private ICarRepository carRepository = new CarRepository();

    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public void add(Car newCar) {
        carRepository.add(newCar);
    }

}
