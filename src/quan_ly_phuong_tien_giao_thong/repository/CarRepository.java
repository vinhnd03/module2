package quan_ly_phuong_tien_giao_thong.repository;

import quan_ly_phuong_tien_giao_thong.common.ReadAndWriteFile;
import quan_ly_phuong_tien_giao_thong.entity.Car;
import quan_ly_phuong_tien_giao_thong.entity.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class CarRepository implements ICarRepository{
    private static final String PATH = "src/quan_ly_phuong_tien_giao_thong/data/car.csv";

    public static List<String> convertToStringList(List<Car> list){
        List<String> stringList = new ArrayList<>();
        for (Car item : list){
            stringList.add(item.infoToCSV());
        }
        return stringList;
    }
    @Override
    public List<Car> findAll() {
        List<Car> cars = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFileCSV(PATH);
        for (String s : stringList){
            String[] arr = s.split("\\s*,\\s*");
            cars.add(new Car(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], Integer.parseInt(arr[4]), arr[5]));
        }
        return cars;
    }

    @Override
    public void add(Car newCar) {
        List<String> stringList = new ArrayList<>();
        stringList.add(newCar.infoToCSV());
        ReadAndWriteFile.writeFileCSV(PATH, stringList, true);
    }

    @Override
    public void delete(Car car) {
        List<Car> carList = findAll();
        carList.remove(car);
        List<String> stringList = convertToStringList(carList);
        ReadAndWriteFile.writeFileCSV(PATH, stringList, false);
    }

}
