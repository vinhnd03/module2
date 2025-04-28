package case_study.repository.impl;

import case_study.common.ReadAndWriteFile;
import case_study.entity.Customer;
import case_study.entity.Employee;
import case_study.repository.ICustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static final String PATH = "src/case_study/data/customer.csv";
    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFileCSV(PATH);
        for (String s : stringList){
            String[] arr = s.split("\\s*,\\s*");
            customerList.add(new Customer(arr[0], arr[1], arr[2], arr[3], Boolean.parseBoolean(arr[4]),
                    arr[5], arr[6], arr[7], arr[8]));
        }
        return customerList;
    }

    @Override
    public void add(Customer customer) {
        List<String> stringList = new ArrayList<>();
        stringList.add(customer.infoToCSVFile());
        ReadAndWriteFile.writeFileCSV(PATH, stringList, true);
    }

    @Override
    public Customer findById(String customerId) {
        List<Customer> customerList = findAll();
        for (Customer customer: customerList){
            if(customer.getId().equals(customerId)){
                return customer;
            }
        }
        return null;
    }

    @Override
    public void update(Customer editedCustomer) {
        List<Customer> customerList = findAll();
        List<String> stringList = new ArrayList<>();
        for(int i = 0; i < customerList.size(); i++){
            if(customerList.get(i).getId().equals(editedCustomer.getId())){
                customerList.set(i, editedCustomer);
            }
            stringList.add(customerList.get(i).infoToCSVFile());
        }
        ReadAndWriteFile.writeFileCSV(PATH, stringList, false);
    }
}
