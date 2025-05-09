package on_tap.repository.impl;

import on_tap.common.ReadAndWriteFile;
import on_tap.entiry.Customer;
import on_tap.entiry.ForeignCustomer;
import on_tap.entiry.LocalCustomer;
import on_tap.repository.ICustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static final String PATH = "src/on_tap/data/customer.csv";
    @Override
    public void add(Customer customer) {
        List<String> stringList = new ArrayList<>();
        if(customer instanceof LocalCustomer){
            stringList.add(((LocalCustomer) customer).toCSVFile());
        }else if(customer instanceof ForeignCustomer){
            stringList.add(((ForeignCustomer) customer).toCSVFile());
        }
        ReadAndWriteFile.writeFileCSV(PATH, stringList, true);
    }

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFileCSV(PATH);
        for (String s : stringList){
            String[] array = s.split("\\s*,\\s*");
            if(array[0].contains("KHVN")){
                customers.add(new LocalCustomer(array[0],array[1], array[2], Double.parseDouble(array[3])));
            }else if(array[0].contains("KHNN")){
                customers.add(new ForeignCustomer(array[0], array[1], array[4]));
            }
        }
        return customers;
    }

    @Override
    public List<Customer> findByName(String name) {
        List<Customer> foundCustomers = new ArrayList<>();
        for (Customer c : findAll()){
            if (c.getName().contains(name)){
                foundCustomers.add(c);
            }
        }
        return foundCustomers;
    }
}
