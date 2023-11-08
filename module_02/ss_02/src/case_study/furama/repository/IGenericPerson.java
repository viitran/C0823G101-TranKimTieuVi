package case_study.furama.repository;
import java.util.List;

public interface IGenericPerson<E>{
    List<E> showList();
    void add(E e);
    void removeByCode(String code);
    E findByCode(String code);
    List<E> searchByName(List<E> e, String name);
    void edit(E e, String code);
}
