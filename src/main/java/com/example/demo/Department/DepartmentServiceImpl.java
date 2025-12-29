package com.example.demo.Department;

import com.example.demo.Department.DTO.RequestDepartmentDTO;
import com.example.demo.Mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Departments create(RequestDepartmentDTO department) {
		//Departments departments = DepartmentMapper.Instance.DepDTO(department);
		//return departmentRepository.save(departments);
		return null;
	}

	@Override
	public List<Departments> getAllDep() {
		return departmentRepository.findAll();
	}
}
