package case_study.service;

import case_study.entity.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    void add(Customer customer);

    Customer findById(String customerId);

    void update(Customer editedCustomer);
}
