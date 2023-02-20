package com.mbs.auth.model;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    private Long attempts;
    
    @Column(name="last_try_invalid")
    private String lastTryInvalid;

    private Boolean enable = true;

    @ManyToAny(metaColumn = @Column(name="profiles"))
    @JoinTable(
        name = "user_profiles",
        joinColumns = @JoinColumn(name="user_id"),
        inverseJoinColumns = @JoinColumn(name="profile_id")
    )
    private List<Profile> profiles;

    public List<String> getProfilesNames(){
        return this.profiles.stream().map(profile -> profile.getName()).collect(Collectors.toList());
    }
}
