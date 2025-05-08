package case_study.repository.impl;

import case_study.common.ReadAndWriteFile;
import case_study.entity.Facility;
import case_study.entity.House;
import case_study.entity.Villa;
import case_study.repository.IVillaRepository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class VillaRepository implements IVillaRepository {
    private static final String PATH = "src/case_study/data/villa.csv";
    @Override
    public Map<Villa, Integer> findAll() {
        Map<Villa, Integer> villaMap = new LinkedHashMap<>();
        List<String> stringList = ReadAndWriteFile.readFileCSV(PATH);
        for (String s: stringList){
            String[] arr = s.split("\\s*,\\s*");
            villaMap.put(new Villa(arr[0], arr[1], Double.parseDouble(arr[2]), Long.parseLong(arr[3]),
                    Integer.parseInt(arr[4]), arr[5], arr[6], Double.parseDouble(arr[7]), Integer.parseInt(arr[8]),
                    Boolean.parseBoolean(arr[9])), Integer.parseInt(arr[10]));
        }
        return villaMap;
    }

    @Override
    public void add(Villa villa) {
        List<String> stringList = new ArrayList<>();
        stringList.add(villa.infoToCSVFile() + ",0");
        ReadAndWriteFile.writeFileCSV(PATH, stringList, true);
    }

    @Override
    public void edit(Map.Entry<Facility, Integer> facilityEntry) {
        Map<Villa, Integer> villamap = findAll();
        villamap.remove((Villa) facilityEntry.getKey());
        villamap.put((Villa) facilityEntry.getKey(), facilityEntry.getValue());
        List<String> stringList = new ArrayList<>();
        for(Map.Entry<Villa, Integer> entry : villamap.entrySet()){
            stringList.add(entry.getKey().infoToCSVFile() + "," + entry.getValue());
        }
        ReadAndWriteFile.writeFileCSV(PATH, stringList, false);
    }
}
