package repository;

import model.SpendingDTO;
import model.SpendingType;

import java.util.List;

public interface ISpendingRepository {
    List<SpendingDTO> showList();
    void addNew(SpendingDTO spendingDTO);
    List<SpendingType> showType();
    boolean removeSpending(int id);
}
