package case_study.repository.impl;

import case_study.common.ReadAndWriteFile;
import case_study.entity.Customer;
import case_study.entity.Facility;
import case_study.entity.House;
import case_study.repository.IHouseRepository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HouseRepository implements IHouseRepository {
    private static final String PATH = "src/case_study/data/house.csv";

    @Override
    public Map<House, Integer> findAll() {
        Map<House, Integer> houseMap = new LinkedHashMap<>();
        List<String> stringList = ReadAndWriteFile.readFileCSV(PATH);
        for (String s : stringList) {
            String[] arr = s.split("\\s*,\\s*");
            houseMap.put(new House(arr[0], arr[1], Double.parseDouble(arr[2]), Long.parseLong(arr[3]),
                    Integer.parseInt(arr[4]), arr[5], arr[6], Integer.parseInt(arr[7]), Boolean.parseBoolean(arr[8])),
                    Integer.parseInt(arr[9]));
        }
        return houseMap;
    }

    @Override
    public void add(House house) {
        List<String> stringList = new ArrayList<>();
        stringList.add(house.infoToCSVFile() + ",0");
        ReadAndWriteFile.writeFileCSV(PATH, stringList, true);
    }

    @Override
    public void edit(Map.Entry<Facility, Integer> facilityEntry) {
        Map<House, Integer> houseMap = findAll();
        houseMap.remove(facilityEntry.getKey());
        houseMap.put((House) facilityEntry.getKey(), facilityEntry.getValue());
        List<String> stringList = new ArrayList<>();
        for(Map.Entry<House, Integer> entry : houseMap.entrySet()){
            stringList.add(entry.getKey().infoToCSVFile() + "," + entry.getValue());
        }
        ReadAndWriteFile.writeFileCSV(PATH, stringList, false);
    }

}
