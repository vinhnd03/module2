package case_study.service.impl;

import case_study.entity.Contract;
import case_study.repository.IContractRepository;
import case_study.repository.impl.ContractRepository;
import case_study.service.IContractService;

public class ContractService implements IContractService {
    private IContractRepository repository = new ContractRepository();

    @Override
    public void addContract(Contract newContract) {
        repository.addContract(newContract);
    }
}
