package com.example.demo.entity;


import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRagistration {
	
	private Long id;
	private String first_name;
	private String phone_number;
	private String last_name;
	private String email;
	private String password;
	private String profile_pic;
	private Boolean status;
	private LocalDateTime created_at;
	private Date updated_at;
	private Boolean top;
	private Boolean desable;
	

}
