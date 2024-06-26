package com.esgis.venteapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esgis.venteapi.models.AuthRequestDTO;
import com.esgis.venteapi.models.JwtResponseDTO;
import com.esgis.venteapi.models.UserInfo;
import com.esgis.venteapi.repositories.UserRepository;
import com.esgis.venteapi.services.JwtService;

@RequestMapping("/api/v1/users")
@RestController
public class AuthController {
    
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtService jwtService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
        private PasswordEncoder encoder;

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/api/adminProfile")
    public String adminProfile() {
        try {
            return "Welcome ADMIN";
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    } 

    @PreAuthorize("hasAuthority('USER')")
    @GetMapping("/api/userProfile")
    public String userProfile() {
        try {
            return "Welcome User";
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    } 

    
    @PostMapping("/login")
    public JwtResponseDTO AuthenticateAndGetToken(@RequestBody AuthRequestDTO authRequestDTO){
        System.out.println("Je suis content");
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequestDTO.getUsername(), authRequestDTO.getPassword()));
        System.out.println("Je suis content 1");
        if(authentication.isAuthenticated()){
        System.out.println("Je suis content 2");
        return JwtResponseDTO.builder()
                .accessToken(jwtService.GenerateToken(authRequestDTO.getUsername())).build();
        } else {
            throw new UsernameNotFoundException("invalid user request..!!");
        }
}

    @PostMapping("/signUp")
    public UserInfo addNewUser(@RequestBody UserInfo userInfo) {
        userInfo.setPassword(encoder.encode(userInfo.getPassword()));
        return userRepository.save(userInfo);
    }
   
}
