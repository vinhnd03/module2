package case_study.service.impl;

import case_study.entity.Customer;
import case_study.repository.IPromotionRepositoty;
import case_study.repository.impl.PromotionRepository;
import case_study.service.IPromotionService;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class PromotionService implements IPromotionService {
    private IPromotionRepositoty repositoty = new PromotionRepository();

    @Override
    public Set<Customer> findCustomerUseServiceByYear(String year) {
        return repositoty.findCustomerUseServiceByYear(year);
    }

    @Override
    public Stack<Customer> getCustomerStack() {
        return repositoty.getCustomerStack();
    }

    @Override
    public Map<Customer, Integer> distributeVoucher(int voucher10, int voucher20, int voucher50) {
        return repositoty.distributeVoucher(voucher20, voucher20, voucher50);
    }
}
