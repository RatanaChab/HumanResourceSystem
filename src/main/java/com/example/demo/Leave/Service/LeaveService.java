package com.example.demo.Leave;

import com.example.demo.Leave.DTO.RequestLeaveDTO;

public interface LeaveService {
	LeaveRequest request(RequestLeaveDTO dto);
}
