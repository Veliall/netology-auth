package com.example.authservice.domain;


import com.example.authservice.authorities.Authorities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String username;
    private String password;
    private List<Authorities> authorities;
}
