package on_tap.service.impl;

import on_tap.entiry.Customer;
import on_tap.repository.ICustomerRepository;
import on_tap.repository.impl.CustomerRepository;
import on_tap.service.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService {
    private ICustomerRepository repository = new CustomerRepository();

    @Override
    public void add(Customer customer) {
        repository.add(customer);
    }

    @Override
    public List<Customer> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Customer> findByName(String name) {
        return repository.findByName(name);
    }
}
