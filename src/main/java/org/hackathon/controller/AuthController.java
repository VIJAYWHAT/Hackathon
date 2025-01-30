package org.hackathon.controller;

import org.hackathon.security.JwtUtil;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        // Mock authentication (replace with real user validation)
        if ("teacher".equals(username) && "password".equals(password)) {
            return JwtUtil.generateToken(username);
        }
        return "Invalid credentials";
    }
}
