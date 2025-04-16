package quan_ly_phuong_tien_giao_thong.repository;

import quan_ly_phuong_tien_giao_thong.entity.Car;

import java.util.ArrayList;

public class CarRepository implements ICarRepository{

    private static ArrayList<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car(5, "Du lịch", "43A-012.34", "Toyota", 2019, "Nguyễn Văn A"));
        cars.add(new Car(45, "Xe khách", "43B-453.88", "Huyndai", 2020, "Nguyễn Văn B"));
        cars.add(new Car(16, "Xe khách", "43B-453.89", "Ford", 2020, "Nguyễn Văn C"));
    }

    @Override
    public ArrayList findAll() {
        return cars;
    }

    @Override
    public void add(Car newCar) {
        cars.add(newCar);
    }

    @Override
    public void delete(Car car) {
        cars.remove(car);
    }

}
