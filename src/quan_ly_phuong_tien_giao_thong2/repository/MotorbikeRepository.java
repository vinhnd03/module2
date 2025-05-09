package quan_ly_phuong_tien_giao_thong2.repository;

import quan_ly_phuong_tien_giao_thong2.common.ReadAndWriteFile;
import quan_ly_phuong_tien_giao_thong2.entity.Motorbike;
import quan_ly_phuong_tien_giao_thong2.repository.IMotorbikeRepository;

import java.util.ArrayList;
import java.util.List;

public class MotorbikeRepository implements IMotorbikeRepository {

    private static final String PATH = "src/quan_ly_phuong_tien_giao_thong/data/motorbike.csv";

    public static List<String> convertToStringList(List<Motorbike> list){
        List<String> stringList = new ArrayList<>();
        for (Motorbike item : list){
            stringList.add(item.infoToCSV());
        }
        return stringList;
    }
    @Override
    public List<Motorbike> findAll() {
        List<Motorbike> Motorbikes = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFileCSV(PATH);
        for (String s : stringList){
            String[] arr = s.split("\\s*,\\s*");
            Motorbikes.add(new Motorbike(Double.parseDouble(arr[0]), arr[1], arr[2], Integer.parseInt(arr[3]), arr[4]));
        }
        return Motorbikes;
    }

    @Override
    public void add(Motorbike newMotorbike) {
        List<String> stringList = new ArrayList<>();
        stringList.add(newMotorbike.infoToCSV());
        ReadAndWriteFile.writeFileCSV(PATH, stringList, true);
    }

    @Override
    public void delete(Motorbike motorbike) {
        List<Motorbike> motorbikeList = findAll();
        motorbikeList.remove(motorbike);
        List<String> stringList = convertToStringList(motorbikeList);
        ReadAndWriteFile.writeFileCSV(PATH, stringList, false);
    }
}
