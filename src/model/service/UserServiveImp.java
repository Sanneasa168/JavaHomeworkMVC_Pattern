package model.service;

import mapper.Mapper;
import model.User;
import model.dao.UserDao;
import model.dao.UserDaoImp;
import model.dto.UserDto;

import java.util.Collections;
import java.util.List;

public class UserServiveImp implements UserService{
    private UserDao userDao = new UserDaoImp();
    @Override
    public List<UserDto> getAllUser() {
        return  userDao.getAllUser()
                .stream()
                .map(Mapper::mapFromUserToUserDto)
                .toList();
    }

    @Override
    public List<UserDto> addNewByUser(User user) {
        userDao.addNewUser(user);
        return List.of();
    }

    @Override
    public List<UserDto> deleteByUser(Integer id) {
        userDao.deleteUser(id);
        return List.of();
    }


}
