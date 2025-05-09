package quan_ly_phuong_tien_giao_thong2.service;

import quan_ly_phuong_tien_giao_thong2.entity.Car;
import quan_ly_phuong_tien_giao_thong2.repository.CarRepository;
import quan_ly_phuong_tien_giao_thong2.repository.ICarRepository;
import quan_ly_phuong_tien_giao_thong2.service.ICarService;

import java.util.ArrayList;
import java.util.List;

public class CarService implements ICarService {
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
