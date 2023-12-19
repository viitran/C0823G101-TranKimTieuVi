package service;

import model.SpendingDTO;
import model.SpendingType;

import java.util.List;

public interface ISpendingService {
    List<SpendingDTO> showList();
    void addNew(SpendingDTO spendingDTO);
    List<SpendingType> showType();
    boolean removeSpending(int id);
}
