package com.mbs.auth.service;

import com.mbs.auth.model.Role;
import com.mbs.auth.model.dto.role.UpdateRoleRequest;

import java.util.List;

public interface RoleService {

    List<Role> list();

    Role create(Role role);

    void updateRole(Long roleId, UpdateRoleRequest dataToUpdate);

    void delete(Long roleId);
}
