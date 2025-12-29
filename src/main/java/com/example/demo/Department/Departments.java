package com.example.demo.Department;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Departments {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	@Column(unique = true, nullable = false)
	private String department;
	private String Description;
}
