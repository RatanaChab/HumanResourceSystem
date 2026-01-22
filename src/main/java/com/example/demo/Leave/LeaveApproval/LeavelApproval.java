package com.example.demo.Leave;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class LeavelApproval {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long requestId;
	private Integer stepOrder;
	private Long approvalId;
	private String approvalStatus;
	private LocalDateTime approvalDate;
}
