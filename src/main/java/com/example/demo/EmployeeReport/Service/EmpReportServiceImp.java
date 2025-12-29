package com.example.demo.EmployeeReport.Service;

import com.example.demo.Employee.Employees;
import com.example.demo.EmployeeReport.Persistence.EmpReportRepository;
import com.example.demo.EmployeeReport.Persistence.EmployeeReporting;
import com.example.demo.Exception.ResourceNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmpReportServiceImp implements EmpReportService {

	private final EmpReportRepository empReportRepository;

	@Override
	public Employees findManager(Long managerId) {
		EmployeeReporting manager = empReportRepository.findById(managerId)
				.orElseThrow(() -> new ResourceNotFoundException("Manager Not Found", managerId));
		return manager.getManager();
	}
}
