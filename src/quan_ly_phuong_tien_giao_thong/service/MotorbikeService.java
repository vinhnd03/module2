package quan_ly_phuong_tien_giao_thong.service;

import quan_ly_phuong_tien_giao_thong.entity.Motorbike;
import quan_ly_phuong_tien_giao_thong.repository.IMotorbikeRepository;
import quan_ly_phuong_tien_giao_thong.repository.MotorbikeRepository;

import java.util.ArrayList;
import java.util.List;

public class MotorbikeService implements IMotorbikeService{
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
