package com.example.demo.EmployeeReport.Persistence;

import com.example.demo.Employee.Employees;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class EmployeeReporting {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	@ManyToOne
	@JoinColumn(name = "employee_id", unique = true)
	private Employees employee;
	@ManyToOne
	@JoinColumn(name = "manager_id")
	private Employees manager;
	private Boolean active = true;

}
