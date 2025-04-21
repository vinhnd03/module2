package case_study.service.impl;

import case_study.repository.ICustomerRepository;
import case_study.repository.impl.CustomerRepository;
import case_study.service.ICustomerService;

public class CustomerService implements ICustomerService {
    private ICustomerRepository repository = new CustomerRepository();
}
