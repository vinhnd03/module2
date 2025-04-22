package case_study.service;

import case_study.entity.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
}
