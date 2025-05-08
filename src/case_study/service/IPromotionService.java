package case_study.service;

import case_study.entity.Customer;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public interface IPromotionService {
    Set<Customer> findCustomerUseServiceByYear(String year);

    Stack<Customer> getCustomerStack();

    Map<Customer, Integer> distributeVoucher(int voucher10, int voucher20, int voucher50);
}
