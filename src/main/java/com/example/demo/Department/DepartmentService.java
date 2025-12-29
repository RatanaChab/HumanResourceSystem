package com.example.demo.Department;

import com.example.demo.Department.DTO.RequestDepartmentDTO;

import java.util.List;

public interface DepartmentService {
	Departments create(RequestDepartmentDTO department);

	List<Departments> getAllDep();
}
