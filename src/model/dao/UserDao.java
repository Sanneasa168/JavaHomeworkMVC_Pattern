package model.dao;

import model.User;

import java.util.List;

public interface UserDao {
    User addNewUser(User user);
    void deleteUser(Integer id);
    List<User> getAllUser();
    void updateUser(User user);
}
