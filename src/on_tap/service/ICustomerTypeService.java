package on_tap.service;

import on_tap.entiry.CustomerType;

import java.util.List;

public interface ICustomerTypeService {
    List<CustomerType> findAll();

    CustomerType findById(String type);
}
