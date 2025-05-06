package case_study.repository.impl;

import case_study.entity.Contract;
import case_study.repository.IBookingRepository;
import case_study.repository.IContractRepository;

import java.util.Set;

public class ContractRepository implements IContractRepository {
    private static IBookingRepository bookingRepository = new BookingRepository();
    @Override
    public void addContract(Contract newContract) {

    }

    public Set<Contract> findAll(){
        return null;
    }
}
