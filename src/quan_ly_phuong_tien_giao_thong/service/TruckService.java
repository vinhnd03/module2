package quan_ly_phuong_tien_giao_thong.service;

import quan_ly_phuong_tien_giao_thong.entity.Motorbike;
import quan_ly_phuong_tien_giao_thong.entity.Truck;
import quan_ly_phuong_tien_giao_thong.repository.ITruckRepository;
import quan_ly_phuong_tien_giao_thong.repository.TruckRepository;

import java.util.ArrayList;
import java.util.List;

public class TruckService implements ITruckService{
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
