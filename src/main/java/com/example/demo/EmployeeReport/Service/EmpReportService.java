package com.example.demo.EmployeeReport.Service;

import com.example.demo.Employee.Employees;

public interface EmpReportService {

	Employees findManager(Long managerId);
}
