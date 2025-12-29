package com.example.demo.AnnualLeave;

import com.example.demo.Employee.Employees;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class AnnualEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne
	@JoinColumn(name = "emp_Code", unique = true, referencedColumnName = "empCode")
	private Employees code;
	@Column(nullable = false, scale = 3)
	private Float forwardLeave;
	@Column(nullable = false, scale = 3)
	private Float totalLeave;
	@Column(nullable = false, scale = 3)
	private Float leaveTaken;
	@Column(nullable = false, scale = 3)
	private Float leaveBalance;
	@Column(nullable = false, scale = 3)
	private Integer leaveApply;
	private String leaveType;
}
