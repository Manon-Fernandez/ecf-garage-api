package com.garage.studi.pojo.dto;

import com.garage.studi.security.models.Role;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class UserDTO {

    private Long id;

    private String username;

    public UserDTO(Long id, String username) {
        this.id = id;
        this.username = username;
    }


}
