package com.example.demo.AnnualLeave;

import com.example.demo.AnnualLeave.DTO.leaveRegisterDTO;
import com.example.demo.Employee.Employees;
import com.example.demo.Exception.ApiException;
import com.example.demo.Employee.EmployeeService;
import com.example.demo.Mapper.AnnualMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@AllArgsConstructor
public class AnnualServiceImpl implements AnnualService {

	private final AnnualRepository annualMgtRepository;
	private final EmployeeService employeeService;
	private final AnnualMapper annualMapper;

	@Override
	public AnnualEntity register(leaveRegisterDTO leaveDto) {
		String code = leaveDto.getCode();
		if (Objects.equals(code, null)) {
			throw new ApiException(HttpStatus.BAD_REQUEST, "Employee can not be empty.");
		}

		Employees employees = employeeService.byEmpCode(code);
		if (employees == null) {
			throw new ApiException(HttpStatus.BAD_REQUEST, "Employee can not Found.");
		}

		AnnualEntity annualEntity = annualMapper.convertCode(leaveDto);
		annualEntity.setCode(employees);
		return annualMgtRepository.save(annualEntity);
	}
}
