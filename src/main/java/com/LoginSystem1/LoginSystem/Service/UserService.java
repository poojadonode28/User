package com.LoginSystem1.LoginSystem.Service;

import com.LoginSystem1.LoginSystem.Entity.User;
import com.LoginSystem1.LoginSystem.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Optional<User> findUserExists(int id){
        Optional<User> user= userRepository.findById(id);
        return user;
    }
    public Optional<User> findUserByToken(String token){
        Optional<User> user= userRepository.findUserByToken(token);
        return user;

    }
}
