package com.example.demo.Employee.DTO;

import com.example.demo.EmployeeDetail.EmployeeDetails;
import com.example.demo.Enum.SexEnum;
import lombok.Data;

import java.time.LocalDate;

@Data
public class CreateEmployeeRequest {
	private String empCode;
	private String firstName;
	private String lastName;
	private String localName;
	private SexEnum sex;
	private LocalDate joinDate;
	private String phone;
	private Long position;
	private EmployeeDetails details;
}
