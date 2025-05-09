package quan_ly_phuong_tien_giao_thong2.repository;

import quan_ly_phuong_tien_giao_thong2.common.ReadAndWriteFile;
import quan_ly_phuong_tien_giao_thong2.entity.Car;
import quan_ly_phuong_tien_giao_thong2.entity.Motorbike;
import quan_ly_phuong_tien_giao_thong2.entity.Truck;
import quan_ly_phuong_tien_giao_thong2.repository.ITruckRepository;

import java.util.ArrayList;
import java.util.List;

public class TruckRepository implements ITruckRepository {
    private static final String PATH = "src/quan_ly_phuong_tien_giao_thong/data/truck.csv";

    public static List<String> convertToStringList(List<Truck> list) {
        List<String> stringList = new ArrayList<>();
        for (Truck item : list) {
            stringList.add(item.infoToCSV());
        }
        return stringList;
    }

    @Override
    public List<Truck> findAll() {
        List<Truck> trucks = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFileCSV(PATH);
        for (String s : stringList) {
            String[] arr = s.split("\\s*,\\s*");
            trucks.add(new Truck(Double.parseDouble(arr[0]), arr[1], arr[2], Integer.parseInt(arr[3]), arr[4]));
        }
        return trucks;
    }

    @Override
    public void add(Truck newTruck) {
        List<String> stringList = new ArrayList<>();
        stringList.add(newTruck.infoToCSV());
        ReadAndWriteFile.writeFileCSV(PATH, stringList, true);
    }

    @Override
    public void delete(Truck truck) {
        List<Truck> truckList = findAll();
        truckList.remove(truck);
        List<String> stringList = convertToStringList(truckList);
        ReadAndWriteFile.writeFileCSV(PATH, stringList, false);
    }
}
