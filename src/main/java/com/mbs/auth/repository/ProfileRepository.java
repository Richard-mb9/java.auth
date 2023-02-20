package com.mbs.auth.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mbs.auth.model.Profile;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository  extends JpaRepository<Profile, Long>{
    
}
