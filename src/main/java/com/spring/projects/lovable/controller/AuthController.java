package com.spring.projects.lovable.controller;


import com.spring.projects.lovable.dto.auth.AuthResponse;
import com.spring.projects.lovable.dto.auth.LoginRequest;
import com.spring.projects.lovable.dto.auth.SignUpRequest;
import com.spring.projects.lovable.dto.auth.UserProfileResponse;
import com.spring.projects.lovable.dto.project.ProjectResponse;
import com.spring.projects.lovable.services.AuthService;
import com.spring.projects.lovable.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

    private AuthService authService;
    private UserService userService;
    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> signup(SignUpRequest request) {
        return ResponseEntity.ok(authService.signup(request));
    }
    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(LoginRequest request) {
        return ResponseEntity.ok(authService.login(request));
    }

    @GetMapping("/me")
    public ResponseEntity<UserProfileResponse> getProfile() {
        Long userId = 1L;
        return ResponseEntity.ok(userService.getProfile(userId));
    }
}
