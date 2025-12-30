package com.example.demo.Employee.DTO;

import com.example.demo.EmployeeDetail.EmployeeDetails;
import com.example.demo.Enum.SexEnum;
import jakarta.validation.constraints.NotNull;
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
	@NotNull(message = "Please Enter Phone")
	private String phone;
	@NotNull(message = "Please choose position")
	private Long position;
	private EmployeeDetails details;
}
