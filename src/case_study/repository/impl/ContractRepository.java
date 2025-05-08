package case_study.repository.impl;

import case_study.common.ReadAndWriteFile;
import case_study.entity.Booking;
import case_study.entity.Contract;
import case_study.repository.IBookingRepository;
import case_study.repository.IContractRepository;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ContractRepository implements IContractRepository {
    private static final String PATH = "src/case_study/data/contract.csv";
    private static IBookingRepository bookingRepository = new BookingRepository();

    @Override
    public void addContract(Contract newContract) {
        Booking booking = bookingRepository.findById(newContract.getBookingId());
        booking.setComplete(true);
        bookingRepository.edit(booking);
        List<String> stringList = new ArrayList<>();
        stringList.add(newContract.getInfoToCSVFile());
        ReadAndWriteFile.writeFileCSV(PATH, stringList, true);
    }

    public Set<Contract> findAll() {
        Set<Contract> contracts = new LinkedHashSet<>();
        List<String> stringList = ReadAndWriteFile.readFileCSV(PATH);
        for (String string : stringList) {
            String[] arr = string.split("\\s*,\\s*");
            contracts.add(new Contract(Integer.parseInt(arr[0]), arr[1], Long.parseLong(arr[2]), Long.parseLong(arr[3])));
        }
        return contracts;
    }

    @Override
    public Contract findByContractNumber(int contractNumber) {
        for (Contract c : findAll()){
            if(c.getContractNumber() == contractNumber){
                return c;
            }
        }
        return null;
    }

    @Override
    public void edit(Contract contract) {
        Set<Contract> contracts = findAll();
        contracts.remove(contract);
        contracts.add(contract);
        List<String> stringList = new ArrayList<>();
        for (Contract c : contracts){
            stringList.add(c.getInfoToCSVFile());
        }
        ReadAndWriteFile.writeFileCSV(PATH, stringList, false);
    }
}
