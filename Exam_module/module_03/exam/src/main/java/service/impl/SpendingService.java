package service.impl;

import model.SpendingDTO;
import model.SpendingType;
import repository.ISpendingRepository;
import repository.impl.SpendingRepository;
import service.ISpendingService;

import java.util.List;

public class SpendingService implements ISpendingService {
    private ISpendingRepository iSpendingRepository = new SpendingRepository();

    @Override
    public List<SpendingDTO> showList() {
        return iSpendingRepository.showList();
    }

    @Override
    public void addNew(SpendingDTO spendingDTO) {
        iSpendingRepository.addNew(spendingDTO);
    }

    @Override
    public List<SpendingType> showType() {
        return iSpendingRepository.showType();
    }

    @Override
    public boolean removeSpending(int id) {
        return iSpendingRepository.removeSpending(id);
    }
}
