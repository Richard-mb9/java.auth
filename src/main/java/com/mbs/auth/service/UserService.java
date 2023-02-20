package com.mbs.auth.service;

import java.util.List;

import com.mbs.auth.model.dto.ResponseUser;

public interface UserService {
    List<ResponseUser> listUser();

    void updateUser();
}
