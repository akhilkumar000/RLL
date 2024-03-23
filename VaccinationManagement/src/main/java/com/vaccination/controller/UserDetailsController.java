package com.vaccination.controller;

import com.vaccination.entity.UserDetails;
import com.vaccination.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vaccination")
public class UserDetailsController {
    @Autowired
    private UserDetailsRepository userDetailsRepository;
    @GetMapping("/allUsers")
    public List<UserDetails> getAlluser(){
        return userDetailsRepository.findAll();
    }

}
