package com.example.demo.Mapper;

import com.example.demo.Department.DTO.RequestDepartmentDTO;
import com.example.demo.Department.Departments;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {

	DepartmentMapper Instance = Mappers.getMapper(DepartmentMapper.class);

//	@Mapping(source = "name", target = "department")
//	Departments DepDTO(RequestDepartmentDTO departments);
}
