package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.UserRagistration;
import com.example.demo.pernaueRagistory.UserRagistrationRepository;

@Service // Makes this class a Spring Bean
public class UserRagistrationService {
	
	@Autowired
    private final UserRagistrationRepository ragistrationRepository;

   
    public UserRagistrationService(UserRagistrationRepository ragistrationRepository) {
        this.ragistrationRepository = ragistrationRepository;
    }

    public UserRagistration create(UserRagistration userRagistration) {
        return ragistrationRepository.save(userRagistration);
    }
}
