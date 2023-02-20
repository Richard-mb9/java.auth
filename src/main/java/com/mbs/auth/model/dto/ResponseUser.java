package com.mbs.auth.model.dto;

import java.util.List;

import com.mbs.auth.model.Profile;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseUser {
    private Long id;

    private String email;

    private Boolean enable;

    private List<String> profiles;
}
