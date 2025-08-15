package com.example.demo.pernaueRagistory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.UserRagistration;

public interface UserRagistrationRepository extends JpaRepository<UserRagistration, Long> {
	

}
