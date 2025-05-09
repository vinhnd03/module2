package case_study.service;

import case_study.entity.Contract;

import java.util.Set;

public interface IContractService {
    void addContract(Contract newContract);
    Set<Contract> findAll();

    Contract findByContractNumber(int contractNumber);

    void edit(Contract contract);

    Contract findById(int contractNumber);
}
