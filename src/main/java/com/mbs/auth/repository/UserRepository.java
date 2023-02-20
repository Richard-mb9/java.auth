package com.mbs.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbs.auth.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
