package case_study.repository;

import case_study.entity.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();

    void add(Customer customer);

    Customer findById(String customerId);

    void update(Customer editedCustomer);
}
