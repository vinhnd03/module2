package quan_ly_phuong_tien_giao_thong.repository;

import quan_ly_phuong_tien_giao_thong.entity.Motorbike;
import quan_ly_phuong_tien_giao_thong.entity.Motorbike;

import java.util.ArrayList;

public class MotorbikeRepository implements IMotorbikeRepository{

    private static ArrayList<Motorbike> motorbikes = new ArrayList<>();

    static {
        motorbikes.add(new Motorbike(100, "43-K1-678.56", "Yamaha", 2019, "Nguyễn Văn A"));
        motorbikes.add(new Motorbike(150, "43-H1-345.89", "Honda", 2018, "Nguyễn Văn B"));
        motorbikes.add(new Motorbike(120, "43-AK-765.23", "Yamaha", 2021, "Nguyễn Văn C"));
    }
    @Override
    public ArrayList<Motorbike> findAll() {
        return motorbikes;
    }

    @Override
    public void add(Motorbike newMotorbike) {
        motorbikes.add(newMotorbike);
    }

    @Override
    public void delete(Motorbike motorbike) {
        motorbikes.remove(motorbike);
    }
}
