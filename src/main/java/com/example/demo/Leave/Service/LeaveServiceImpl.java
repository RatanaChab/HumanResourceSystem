package com.example.demo.Leave;

import com.example.demo.Approval.ApprovalFlow;
import com.example.demo.Approval.ApprovalStep;
import com.example.demo.Approval.Repository.ApprovalFlowRepository;
import com.example.demo.Approval.Repository.ApprovalStepRepository;
import com.example.demo.Approval.Service.ApprovalFlowService;
import com.example.demo.Approval.Service.ApprovalStepService;
import com.example.demo.Employee.EmployeeService;
import com.example.demo.Employee.Employees;
import com.example.demo.EmployeeReport.Persistence.EmpReportRepository;
import com.example.demo.EmployeeReport.Service.EmpReportService;
import com.example.demo.Enum.ProcessStatus;
import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.Leave.DTO.RequestLeaveDTO;
import com.example.demo.Mapper.LeaveMapper;
import com.example.demo.OrgUnit.OrgDTO.OrgDTO;
import com.example.demo.OrgUnit.OrgRepository;
import com.example.demo.OrgUnit.Organizations;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@AllArgsConstructor
@Slf4j
public class LeaveServiceImpl implements LeaveService {

	private final LeaveRepository leaveRepository;
	private final ApprovalFlowService approvalFlowService;
	private final EmployeeService employeeService;
	private final LeaveMapper leaveMapper;

	@Override
	public LeaveRequest request(RequestLeaveDTO dto) {
		employeeService.getById(dto.getEmployeeId());

		if (dto.getLeaveType().name() == "SICK") {
			log.info("Request leave type is sick");
		}
		LeaveRequest leaveRequest = leaveMapper.LeaveToDTO(dto);
		leaveRequest.setCurrentStep(1);
		leaveRequest.setStatus(ProcessStatus.SUBMITTED);
		leaveRequest.setApplyDate(LocalDateTime.now());

		if (Boolean.FALSE.equals(dto.getHalfDay())) {
			int dayOfStart = dto.getStartDate().getDayOfMonth();
			int dayOfEnd = dto.getEndDate().getDayOfMonth();
			leaveRequest.setTotalDay((float) ((dayOfEnd - dayOfStart) + 1));
		} else {
			leaveRequest.setTotalDay(0.5f);
		}

		ApprovalFlow approvalFlow = approvalFlowService.selectFlow(leaveRequest);
		leaveRequest.setApprovalFlow(approvalFlow.getId());
		leaveRepository.save(leaveRequest);
		
		return leaveRequest;
	}
}
