package com.example.demo.Approval;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class ApprovalStep {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long flowId;
	private Integer stepOrder;
	private Long approvalGroup;
	private String stepName;
}
