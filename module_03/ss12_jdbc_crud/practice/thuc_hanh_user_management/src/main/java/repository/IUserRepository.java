package repository;

import model.User;

import java.util.List;

public interface IUserRepository {
    List<User> showList();
    void addNew(User user);
    Boolean edit(User user);
    Boolean removeUser(int id);
    User findById(int id);
    List<User> search(String name);
    List<User> sort();
}
