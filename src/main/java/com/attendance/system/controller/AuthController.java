package com.attendance.system.controller;

import com.attendance.system.entity.User;
import com.attendance.system.repository.UserRepository;
import com.attendance.system.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody User loginRequest) {

        User user = userRepository.findById(loginRequest.getUserId())
                .orElseThrow(() -> new RuntimeException("Invalid user"));

        if (!user.getPassword().equals(loginRequest.getPassword())) {
            throw new RuntimeException("Invalid password");
        }

        String token = JwtUtil.generateToken(
                user.getUserId(),
                user.getRole()
        );

        return Map.of("token", token);
    }
}
