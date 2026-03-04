package com.attendance.system.controller;

import com.attendance.system.entity.User;
import com.attendance.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login(
            @RequestParam String userId,
            @RequestParam String password
    ) {
        User user = userService.login(userId, password);

        if (user != null) {
            return "Login successful! Role: " + user.getRole();
        } else {
            return "Invalid credentials";
        }
    }

    @GetMapping("/")
    public String home() {
        return "Attendance Manager Backend is running!";
    }
}
