package com.mbs.auth.service;

import com.mbs.auth.model.Profile;
import com.mbs.auth.model.dto.role.UpdateRoleRequest;

import java.util.List;

public interface ProfileService {
    List<Profile> list();

    Profile create(Profile profile);

    void update(Long id, UpdateRoleRequest dataToUpdate);

    void delete(Long id);
}
