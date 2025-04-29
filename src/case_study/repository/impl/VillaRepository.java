package case_study.repository.impl;

import case_study.common.ReadAndWriteFile;
import case_study.entity.Villa;
import case_study.repository.IVillaRepository;

import java.util.ArrayList;
import java.util.List;

public class VillaRepository implements IVillaRepository {
    private static final String PATH = "src/case_study/data/villa.csv";
    @Override
    public List<Villa> findAll() {
        List<Villa> villaList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFileCSV(PATH);
        for (String s: stringList){
            String[] arr = s.split("\\s*,\\s*");
            villaList.add(new Villa(arr[0], arr[1], Double.parseDouble(arr[2]), Long.parseLong(arr[3]),
                    Integer.parseInt(arr[4]), arr[5], arr[6], Double.parseDouble(arr[7]), Integer.parseInt(arr[8])));
        }
        return villaList;
    }
}
