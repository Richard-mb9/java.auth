package com.mbs.auth.service.impl;

import com.mbs.auth.model.Role;
import com.mbs.auth.model.dto.role.UpdateRoleRequest;
import com.mbs.auth.repository.RoleRepository;
import com.mbs.auth.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImp implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> list() {
        return roleRepository.findAll();
    }

    @Override
    public Role create(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void updateRole(Long roleId, UpdateRoleRequest dataToUpdate) {
        Optional<Role> role = this.roleRepository.findById(roleId);
        role.ifPresent(r-> {
            r.setName(dataToUpdate.getName());
            this.roleRepository.save(r);
        } );
    }

    @Override
    public void delete(Long roleId) {
            Optional<Role> role = roleRepository.findById(roleId);
            if(!role.isEmpty()){
                roleRepository.deleteById(roleId);
            }
    }
}
