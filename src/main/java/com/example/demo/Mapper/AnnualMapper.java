package com.example.demo.Mapper;

import com.example.demo.AnnualLeave.AnnualEntity;
import com.example.demo.Employee.Employees;
import com.example.demo.AnnualLeave.DTO.leaveRegisterDTO;
import com.example.demo.Employee.EmployeeService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = EmployeeService.class)
public interface AnnualMapper {

	AnnualMapper INSTANCE = Mappers.getMapper(AnnualMapper.class);

	@Mapping(
			source = "code",
			target = "code",
			qualifiedByName = "mapStatus"
	)
	AnnualEntity convertCode(leaveRegisterDTO dto);

	@Named("mapStatus")
	default Employees mapStatus(String empCode) {
		Employees emp = new Employees();
		emp.setEmpCode(empCode);
		return emp;
	}
}
