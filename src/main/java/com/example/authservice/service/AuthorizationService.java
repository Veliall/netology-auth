package com.example.authservice.service;

import com.example.authservice.authorities.Authorities;
import com.example.authservice.exceptions.InvalidCredentials;
import com.example.authservice.exceptions.UnauthorizedUser;
import com.example.authservice.exceptions.WrongUsernameOrPassword;
import com.example.authservice.repository.UserRepository;
import com.example.authservice.utils.AuthoritiesHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorizationService {
    private final UserRepository userRepository;

    @Transactional
    public List<Authorities> getAuthorities(String username, String password) {
        if (isEmpty(username) || isEmpty(password)) {
            throw new InvalidCredentials("User name or password is empty");
        }

        final var user = userRepository.findById(username).orElseThrow(WrongUsernameOrPassword::new);
        if (!user.getPassword().equals(password)) {
            throw new WrongUsernameOrPassword("Wrong username or password");
        }

        final var authorities = AuthoritiesHandler.handleAuthorities(user.getAuthorities());
        if (isEmpty(authorities)) {
            throw new UnauthorizedUser("Unknown user " + username);
        }
        return authorities;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    private boolean isEmpty(List<?> str) {
        return str == null || str.isEmpty();
    }
}
