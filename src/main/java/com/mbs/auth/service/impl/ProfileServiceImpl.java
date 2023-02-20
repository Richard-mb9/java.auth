package com.mbs.auth.service.impl;

import com.mbs.auth.model.Profile;
import com.mbs.auth.model.dto.role.UpdateRoleRequest;
import com.mbs.auth.repository.ProfileRepository;
import com.mbs.auth.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileServiceImpl implements ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    @Override
    public List<Profile> list() {
        return this.profileRepository.findAll();
    }

    @Override
    public Profile create(Profile profile) {
        return profile;
    }

    @Override
    public void update(Long id, UpdateRoleRequest dataToUpdate) {

    }

    @Override
    public void delete(Long id) {

    }
}
