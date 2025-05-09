package quan_ly_phuong_tien_giao_thong2.service;

import quan_ly_phuong_tien_giao_thong2.entity.Motorbike;
import quan_ly_phuong_tien_giao_thong2.entity.Truck;
import quan_ly_phuong_tien_giao_thong2.repository.ITruckRepository;
import quan_ly_phuong_tien_giao_thong2.repository.TruckRepository;
import quan_ly_phuong_tien_giao_thong2.service.ITruckService;

import java.util.ArrayList;
import java.util.List;

public class TruckService implements ITruckService {
    private ITruckRepository truckRepository = new TruckRepository();

    @Override
    public List<Truck> findAll() {
        return truckRepository.findAll();
    }

    @Override
    public void add(Truck newTruck) {
        truckRepository.add(newTruck);
    }
}
