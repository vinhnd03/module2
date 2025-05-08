package case_study.repository.impl;

import case_study.entity.Booking;
import case_study.entity.Customer;
import case_study.repository.IBookingRepository;
import case_study.repository.ICustomerRepository;
import case_study.repository.IPromotionRepositoty;

import java.util.*;

public class PromotionRepository implements IPromotionRepositoty {
    private IBookingRepository bookingRepository = new BookingRepository();
    private ICustomerRepository customerRepository = new CustomerRepository();
    @Override
    public Set<Customer> findCustomerUseServiceByYear(String year) {
        Set<Customer> customers = new HashSet<>();
        List<Booking> bookings = bookingRepository.findAll();
        for(Booking booking : bookings){
            if(booking.getDate().contains(year)){
                Customer customer = customerRepository.findById(booking.getCustomerId());
                customers.add(customer);
            }
        }
        return customers;
    }

    public Stack<Customer> getCustomerStack(){
        Stack<Customer> customerStack = new Stack<>();
        for(Booking booking : bookingRepository.findAll()){
            Customer customer = customerRepository.findById(booking.getCustomerId());
            if(!customerStack.contains(customer)){
                customerStack.push(customer);
            }
        }
        return customerStack;
    }

    @Override
    public Map<Customer, Integer> distributeVoucher(int voucher10, int voucher20, int voucher50) {
        Map<Customer, Integer> map = new LinkedHashMap<>();
        Stack<Customer> stack = getCustomerStack();

        while (voucher10 > 0 && !stack.isEmpty()){
            map.put(stack.pop(), 1);
            voucher10--;
        }
        while (voucher20 > 0 && !stack.isEmpty()){
            map.put(stack.pop(), 2);
            voucher20--;
        }
        while (voucher50 > 0 && !stack.isEmpty()){
            map.put(stack.pop(), 3);
            voucher50--;
        }
        return map;
    }


}
