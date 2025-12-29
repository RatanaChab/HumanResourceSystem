package com.example.demo.Employee;

import com.example.demo.Employee.DTO.CreateEmployeeRequest;
import com.example.demo.EmployeeDetail.EmployeeDetails;
import com.example.demo.Employee.DTO.addUserEmp;

import java.util.List;

public interface EmployeeService {
	Employees createEmployee(Employees employees);

	Employees saveEmployee(CreateEmployeeRequest employees);

	EmployeeDetails createEmployeeDetail(EmployeeDetails employeeDetails);

	Employees updateEmployee(String code, Employees employees);

	List<Employees> getListEmp();

	Employees getById(Long id);

	Employees byEmpCode(String code);

	Employees addUser(addUserEmp userEmp, String empCode);
}
