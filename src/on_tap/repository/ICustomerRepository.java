package on_tap.repository;

import on_tap.entiry.Customer;

import java.util.List;

public interface ICustomerRepository {
    void add(Customer customer);

    List<Customer> findAll();

    List<Customer> findByName(String name);
}
