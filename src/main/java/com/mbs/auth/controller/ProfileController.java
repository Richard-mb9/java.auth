package com.mbs.auth.controller;

import com.mbs.auth.Exeptions.RestExceptions;
import com.mbs.auth.model.Profile;

import com.mbs.auth.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/profiles")
public class ProfileController extends RestExceptions {
    @Autowired
    private ProfileService profileService;

    @GetMapping
    public List<Profile> list(){
        return  this.profileService.list();
    }
}
