package on_tap.service.impl;

import on_tap.entiry.CustomerType;
import on_tap.repository.ICustomerTypeRepository;
import on_tap.repository.impl.CustomerTypeRepository;
import on_tap.service.ICustomerTypeService;

import java.util.List;

public class CustomerTypeService implements ICustomerTypeService {
    private ICustomerTypeRepository repository = new CustomerTypeRepository();

    @Override
    public List<CustomerType> findAll() {
        return repository.findAll();
    }

    @Override
    public CustomerType findById(String type) {
        return repository.findById(type);
    }
}
