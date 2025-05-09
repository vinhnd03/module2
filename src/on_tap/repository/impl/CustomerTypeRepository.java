package on_tap.repository.impl;

import on_tap.common.ReadAndWriteFile;
import on_tap.entiry.CustomerType;
import on_tap.repository.ICustomerTypeRepository;

import java.util.ArrayList;
import java.util.List;

public class CustomerTypeRepository implements ICustomerTypeRepository {
    private static final String PATH = "src/on_tap/data/customer_type.csv";
    @Override
    public List<CustomerType> findAll() {
        List<String> stringList = ReadAndWriteFile.readFileCSV(PATH);
        List<CustomerType> customerTypes = new ArrayList<>();
        for (String s : stringList){
            String[] array = s.split("\\s*,\\s*");
            customerTypes.add(new CustomerType(array[0], array[1]));
        }
        return customerTypes;
    }

    @Override
    public CustomerType findById(String typeId) {
        for (CustomerType customerType : findAll()){
            if(customerType.getId().equals(typeId)){
                return customerType;
            }
        }
        return null;
    }
}
