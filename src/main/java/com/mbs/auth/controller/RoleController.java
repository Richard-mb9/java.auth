package com.mbs.auth.controller;

import com.mbs.auth.Exeptions.RestExceptions;
import com.mbs.auth.model.Role;
import com.mbs.auth.model.dto.role.UpdateRoleRequest;
import com.mbs.auth.repository.RoleRepository;
import com.mbs.auth.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/roles")
public class RoleController extends RestExceptions {
    @Autowired
    private RoleService roleService;

    @GetMapping
    public List<Role> listRoles(){return  this.roleService.list();}

    @PostMapping
    public Role createRole(@RequestBody @Valid  Role role){
        return roleService.create(role);
    }

    @PutMapping("/{roleId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateRole(
            @PathVariable("roleId") Long roleId,
            @RequestBody @Valid UpdateRoleRequest dataToUpdate
            ){
        roleService.updateRole(roleId, dataToUpdate);
    }

    @DeleteMapping(value = "/{roleId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteRole(@PathVariable("roleId") Long roleId){
        roleService.delete(roleId);
    }

}
