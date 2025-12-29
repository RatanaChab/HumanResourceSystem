package com.example.demo.AnnualLeave.DTO;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class leaveRegisterDTO {

	private String code;
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
