package com.example.demo.User;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	@Column(unique = true, nullable = false)
	private String username;
	private String password;

}


