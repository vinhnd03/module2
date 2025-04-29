package case_study.repository.impl;

import case_study.common.ReadAndWriteFile;
import case_study.entity.Customer;
import case_study.entity.House;
import case_study.repository.IHouseRepository;

import java.util.ArrayList;
import java.util.List;

public class HouseRepository implements IHouseRepository {
    private static final String PATH = "src/case_study/data/house.csv";

    @Override
    public List<House> findAll() {
        List<House> houseList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFileCSV(PATH);
        for (String s : stringList) {
            String[] arr = s.split("\\s*,\\s*");
            houseList.add(new House(arr[0], arr[1], Double.parseDouble(arr[2]), Long.parseLong(arr[3]),
                    Integer.parseInt(arr[4]), arr[5], arr[6], Integer.parseInt(arr[7])));
        }
        return houseList;
    }

    @Override
    public void add(House house) {
        List<String> stringList = new ArrayList<>();
        //stringList.add(house.)
    }
}
