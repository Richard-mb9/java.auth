package com.mbs.auth.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;

import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.Data;

@Data
@Entity
@Table(name = "profiles")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToAny(metaColumn = @Column(name = "roles"))
    @JoinTable(
        name = "profiles_roles",
        joinColumns = @JoinColumn(name="profile_id"),
        inverseJoinColumns = @JoinColumn(name="role_id")
    )
    private List<Role> roles;
}
