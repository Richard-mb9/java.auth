package com.mbs.auth.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mbs.auth.model.User;
import com.mbs.auth.model.dto.ResponseUser;
import com.mbs.auth.repository.UserRepository;
import com.mbs.auth.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<ResponseUser> listUser() {
        List<User> users= userRepository.findAll();

        List<ResponseUser> usersFormatted = users.stream().map(user -> ResponseUser.builder()
                .id(user.getId())
                .email(user.getEmail())
                .enable(user.getEnable())
                .profiles(user.getProfilesNames())
                .build()).collect(Collectors.toList());

        return usersFormatted;
    }

    @Override
    public void updateUser() {

    }
}
