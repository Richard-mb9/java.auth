package com.mbs.auth.controller;

import java.util.List;

import com.mbs.auth.model.dto.UpdateUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.mbs.auth.model.User;
import com.mbs.auth.model.dto.ResponseUser;
import com.mbs.auth.repository.UserRepository;
import com.mbs.auth.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @GetMapping
    public List<ResponseUser> listUser(){
        return this.userService.listUser();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @PutMapping(value = "/{userId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateUser(
            @PathVariable Long userId,
            @RequestBody UpdateUser dataToUpdate
    ){
        System.out.println(userId);
    }
}
