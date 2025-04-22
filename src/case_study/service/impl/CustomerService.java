package case_study.service.impl;

import case_study.entity.Customer;
import case_study.repository.ICustomerRepository;
import case_study.repository.impl.CustomerRepository;
import case_study.service.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService {
    private ICustomerRepository repository = new CustomerRepository();

    @Override
    public List<Customer> findAll() {
        return repository.findAll();
    }
}
