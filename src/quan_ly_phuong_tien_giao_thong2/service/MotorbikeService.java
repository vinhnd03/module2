package quan_ly_phuong_tien_giao_thong2.service;

import quan_ly_phuong_tien_giao_thong2.entity.Motorbike;
import quan_ly_phuong_tien_giao_thong2.repository.IMotorbikeRepository;
import quan_ly_phuong_tien_giao_thong2.repository.MotorbikeRepository;
import quan_ly_phuong_tien_giao_thong2.service.IMotorbikeService;

import java.util.ArrayList;
import java.util.List;

public class MotorbikeService implements IMotorbikeService {
    private IMotorbikeRepository motorbikeRepository = new MotorbikeRepository();

    @Override
    public List<Motorbike> findAll() {
        return motorbikeRepository.findAll();
    }

    @Override
    public void add(Motorbike newMotorbike) {
        motorbikeRepository.add(newMotorbike);
    }
}
