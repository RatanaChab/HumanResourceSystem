package com.example.demo.Mapper;

import com.example.demo.Employee.DTO.CreateEmployeeRequest;
import com.example.demo.Employee.Employees;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

	EmployeeMapper Instance = Mappers.getMapper(EmployeeMapper.class);

	//@Mapping(target = "position", expression = "java(request.getPosition())")
	@Mapping(source = "position", target = "position.id")
	Employees empMapping(CreateEmployeeRequest request);
}
