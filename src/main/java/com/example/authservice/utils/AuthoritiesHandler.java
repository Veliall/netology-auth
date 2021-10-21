package com.example.authservice.utils;

import com.example.authservice.authorities.Authorities;

import java.util.List;
import java.util.stream.Collectors;

public class AuthoritiesHandler {
    private AuthoritiesHandler() {
    }

    public static List<Authorities> handleAuthorities(List<String> authorities) {
        return authorities.stream()
                .map(o -> {
                    switch (o) {
                        case "READ":
                            return Authorities.READ;
                        case "WRITE":
                            return Authorities.WRITE;
                        default:
                            return Authorities.DELETE;
                    }
                })
                .collect(Collectors.toList());
    }
}
