package on_tap.service;

import on_tap.entiry.Customer;

import java.util.List;

public interface ICustomerService {
    void add(Customer customer);

    List<Customer> findAll();

    List<Customer> findByName(String name);
}
