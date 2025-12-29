package com.example.demo.Department;

import com.example.demo.Department.DTO.RequestDepartmentDTO;
import com.example.demo.Exception.HttpResponse.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/department")
@CrossOrigin("*")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@PostMapping()
	public ResponseEntity<?> create(@RequestBody RequestDepartmentDTO department) {
		ApiResponse<Object> response = new ApiResponse<Object>(
				HttpStatus.OK.toString(),
				"successfully",
				departmentService.create(department),
				null);
		return ResponseEntity.ok(response);
	}

	@GetMapping("/all")
	public ResponseEntity<?> getAll() {
		ApiResponse<Object> response = new ApiResponse<Object>(
				HttpStatus.OK.toString(),
				"successfully",
				departmentService.getAllDep(),
				null);
		return ResponseEntity.ok(response);
	}
}
