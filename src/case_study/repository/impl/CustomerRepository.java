package case_study.repository.impl;

import case_study.entity.Customer;
import case_study.entity.Employee;
import case_study.repository.ICustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static List<Customer> customers = new ArrayList<>();

    static {
        customers.add(new Customer("KH00023", "Nguyen Duc Vinh", "12-05-2003", "10111011101",
                true, "0123456789", "ducvinh@gmail.com", "Diamond", "Đà Nẵng"));
        customers.add(new Customer("KH00024", "Nguyen Duc Vinh", "12-05-2003", "10111011101",
                true, "0123456789", "ducvinh@gmail.com", "Silver", "Quảng Bình"));
    }
    @Override
    public List<Customer> findAll() {
        return customers;
    }
}
