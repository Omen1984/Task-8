package crud.service;

import crud.model.User;

import java.util.List;

public interface UserService {

    void save(User user);

    List<User> findAll();

    User findById(long id);

    void update(User user);

    void deleteById(long id);

}
