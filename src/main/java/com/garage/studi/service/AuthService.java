package com.garage.studi.service;

import com.garage.studi.security.models.User;
import com.garage.studi.security.payload.repository.UserRepository;
import com.garage.studi.security.payload.request.SignupRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void changePassword(SignupRequest user){
        Optional<User> oldUser = userRepository.findByUsername(user.getUsername());
        if(oldUser.isPresent()){
          User monUser = oldUser.get();
          monUser.setPassword(passwordEncoder.encode(user.getPassword()));
          this.userRepository.save(monUser);
        }
    }
}
