package model.dao;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImp  implements UserDao{
    private List<User> userList  = new ArrayList<>(
            List.of(new User(1,"San","San@gmail.com"),
                    new User(2,"Kim","Kim@gmail.com"))
    );
    @Override
    public User addNewUser(User user) {
        userList.add(user);
        return user;
    }

    @Override
    public void deleteUser(Integer id) {
         userList.removeIf(e->e.getId().equals(id));
    }

    @Override
    public List<User> getAllUser() {
        return userList;
    }

    @Override
    public void updateUser(User user) {

    }
}
