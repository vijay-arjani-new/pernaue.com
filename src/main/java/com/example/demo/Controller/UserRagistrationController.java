package com.example.demo.Controller;

import java.security.Provider.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.UserRagistration;
import com.example.demo.service.UserRagistrationService;
@RestController 
@RequestMapping("/ragistration")
public class UserRagistrationController {

    private final UserRagistrationService ragistrationService;

    public UserRagistrationController(UserRagistrationService ragistrationService) {
        this.ragistrationService = ragistrationService;
    }

    @PostMapping 
    public ResponseEntity<?> CreateUser(@RequestBody UserRagistration userRagistration) {
       
        UserRagistration ragistration=	ragistrationService.create(userRagistration);
    	
    	
        return ResponseEntity.status(200).body(ragistration);
    }
}



