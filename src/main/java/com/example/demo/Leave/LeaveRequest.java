package com.example.demo.Leave;

import com.example.demo.Enum.LeaveTypeEnum;
import com.example.demo.Enum.ProcessStatus;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
public class LeaveRequest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long employeeId;
	@Enumerated(EnumType.STRING)
	private LeaveTypeEnum leaveType;
	private LocalDate startDate;
	private LocalDate endDate;
	@Enumerated(EnumType.STRING)
	private ProcessStatus status;
	private Integer currentStep;
	private Long approvalFlow;
	@CreatedDate
	private LocalDateTime createDate;

}
