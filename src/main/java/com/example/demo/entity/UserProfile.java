package com.example.demo.entity;

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
public class UserProfile {
	
	private int user_profile_id;
	private Long user_ragistration_id;
	private Date Dob;
	private int age;
	private Long height;
	private String gender;
	private String marital_status;
	private String profession;
	private String highest_education;
	private String  annual_income;
	private String mother_name;
	private String father_name;
	private String mother_ocupation;
	private String father_ocpation;
	private int sibling;
	private Long family_income;
	private String state;
	private String city;
	private String about_me;
	private String image_first;
	private String image_secound;
	private Date created_at;
	private Date updated_at;
	

}
