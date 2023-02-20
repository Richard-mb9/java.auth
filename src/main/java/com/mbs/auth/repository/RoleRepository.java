package com.mbs.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbs.auth.model.Role;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
}
