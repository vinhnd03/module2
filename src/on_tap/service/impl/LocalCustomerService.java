package on_tap.service.impl;

import on_tap.repository.ILocalCustomerRepository;
import on_tap.repository.impl.LocalCustomerRepository;
import on_tap.service.ILocalCustomerService;

public class LocalCustomerService implements ILocalCustomerService {
    private ILocalCustomerRepository repository = new LocalCustomerRepository();
}
