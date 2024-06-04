package model.service;
import model.User;
import model.dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> getAllUser();
    List<UserDto>  addNewByUser(User User);
    List<UserDto> deleteByUser(Integer id);
}
