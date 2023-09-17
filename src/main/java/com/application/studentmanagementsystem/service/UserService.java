package com.application.studentmanagementsystem.service;

import com.application.studentmanagementsystem.dto.UserDto;
import com.application.studentmanagementsystem.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
