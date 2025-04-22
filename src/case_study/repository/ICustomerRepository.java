package case_study.repository;

import case_study.entity.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();
}
