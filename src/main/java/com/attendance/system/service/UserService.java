package com.attendance.system.service;

import com.attendance.system.entity.User;
import com.attendance.system.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User login(String userId, String password) {
        Optional<User> user = userRepository.findById(userId);

        if (user.isPresent() && user.get().getPassword().equals(password)) {
            return user.get();
        }
        return null;
    }
}
