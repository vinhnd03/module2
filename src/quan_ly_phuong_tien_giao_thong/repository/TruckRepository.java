package quan_ly_phuong_tien_giao_thong.repository;

import quan_ly_phuong_tien_giao_thong.entity.Car;
import quan_ly_phuong_tien_giao_thong.entity.Motorbike;
import quan_ly_phuong_tien_giao_thong.entity.Truck;

import java.util.ArrayList;

public class TruckRepository implements ITruckRepository{
    private static ArrayList<Truck> trucks = new ArrayList<>();

    static {
        trucks.add(new Truck(3, "43A-012.34", "Huyndai", 2019, "Nguyễn Văn A"));
        trucks.add(new Truck(9, "43C-47.678", "Dongfeng", 2020, "Nguyễn Văn B"));
        trucks.add(new Truck(12, "43C-45.235", "Hino", 2021, "Nguyễn Văn C"));
    }
    @Override
    public ArrayList<Truck> findAll() {
        return trucks;
    }

    @Override
    public void add(Truck newTruck) {
        trucks.add(newTruck);
    }

    @Override
    public void delete(Truck truck) {
        trucks.remove(truck);
    }
}
