package com.example.demo.Employee;

import com.example.demo.Employee.DTO.CreateEmployeeRequest;
import com.example.demo.EmployeeDetail.EmployeeDetails;
import com.example.demo.Mapper.EmployeeMapper;
import com.example.demo.User.UserEntity;
import com.example.demo.Exception.ApiException;
import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.EmployeeDetail.EmpDetailRepository;
import com.example.demo.User.UserRepository;
import com.example.demo.Employee.DTO.addUserEmp;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@Slf4j
@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

	private final EmployeeRepository employeeRepository;
	private final EmpDetailRepository empDetailRepository;
	private final UserRepository userRepository;
	private final EmployeeMapper employeeMapper;

	@Transactional
	@Override
	public Employees createEmployee(Employees employees) {
		employeeRepository.save(employees);
		empDetailRepository.save(employees.getDetails());
		return employees;
	}

	@Override
	public EmployeeDetails createEmployeeDetail(EmployeeDetails employeeDetails) {
		Employees employees = getById(employeeDetails.getId());
		EmployeeDetails employeeDetails1 = new EmployeeDetails();

		return empDetailRepository.save(employeeDetails1);
	}


	@Override
	public Employees updateEmployee(String code, Employees employees) {
		Employees byEmpCode = employeeRepository.findByEmpCode(code);
		Employees employeeId = getById(byEmpCode.getId());
		employees.setId(employeeId.getId());
		employees.getDetails().setId(employeeId.getId());
		return employeeRepository.save(employees);
	}

	@Override
	public List<Employees> getListEmp() {
		return employeeRepository.findAll();
	}

	@Override
	public Employees getById(Long id) {
		return employeeRepository
				.findById(id).orElseThrow(() -> new ResourceNotFoundException("Not found", id));
	}

	@Override
	public Employees byEmpCode(String code) {
		return employeeRepository.findByEmpCode(code);
	}

	@Override
	public Employees addUser(addUserEmp userEmp, String empCode) {
		Employees employees = byEmpCode(empCode);
//		UserEntity byusername = userRepository.findByUsername(userEmp.getUsername());
//
//		if (byusername == null) {
//			throw new ApiException(HttpStatus.BAD_REQUEST, "User Not Exist");
//		}
//
//		// find user that not belong to other
//		boolean checkUserBelong = employeeRepository.findAll()
//				.stream()
//				.filter(Objects::nonNull) // Prevent null employees in list
//				.filter(emp -> emp.getUser() != null) // Prevent employees with no user
//				.anyMatch(empUser ->
//						empUser.getUser().getUsername().equals(byusername.getUsername()));
//
//		if (checkUserBelong) {
//			throw new ApiException(HttpStatus.BAD_REQUEST, "User belong to other.");
//		} else {
//			employees.setUser(byusername);
//			return employeeRepository.save(employees);
//		}
		return employees;
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public Employees saveEmployee(CreateEmployeeRequest employees) {
		Employees empMapping = employeeMapper.empMapping(employees);
		EmployeeDetails details = empDetailRepository.save(empMapping.getDetails());
		//empMapping.setDetails(details);
		employeeRepository.save(empMapping);
		return empMapping;
	}

}
