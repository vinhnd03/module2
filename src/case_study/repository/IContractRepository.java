package case_study.repository;

import case_study.entity.Contract;

import java.util.Set;

public interface IContractRepository {
    void addContract(Contract newContract);
    Set<Contract> findAll();

    Contract findByContractNumber(int contractNumber);

    void edit(Contract contract);
}
