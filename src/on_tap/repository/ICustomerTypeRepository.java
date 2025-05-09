package on_tap.repository;

import on_tap.entiry.CustomerType;

import java.util.List;

public interface ICustomerTypeRepository {
    List<CustomerType> findAll();

    CustomerType findById(String type);
}
