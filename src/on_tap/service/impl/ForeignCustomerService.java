package on_tap.service.impl;

import on_tap.repository.IForeignCustomerRepository;
import on_tap.repository.impl.ForeignCustomerRepository;
import on_tap.service.IForeignCustomerService;

public class ForeignCustomerService implements IForeignCustomerService {
    private IForeignCustomerRepository repository = new ForeignCustomerRepository();
}
