package com.example.demo.Employee.Controller;

import com.example.demo.Employee.DTO.CreateEmployeeRequest;
import com.example.demo.Employee.EmployeeService;
import com.example.demo.Employee.Employees;
import com.example.demo.EmployeeDetail.EmployeeDetails;
import com.example.demo.Exception.HttpResponse.ApiResponse;
import com.example.demo.Employee.DTO.addUserEmp;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(originPatterns = "http://localhost:3000/", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class EmployeeController {

	private static final String SUCCESS = "Successfully";

	private final EmployeeService employeeService;

	@PostMapping("/employee")
	public ResponseEntity<?> create(@RequestBody Employees employees) {
		ApiResponse<Object> response = new ApiResponse<Object>(
				HttpStatus.OK.toString(),
				SUCCESS,
				employeeService.createEmployee(employees),
				null);
		return ResponseEntity.ok(response);
	}

	@PostMapping("/RequestEmployee")
	public ResponseEntity<?> EmployeeRequest(@RequestBody CreateEmployeeRequest employees) {
		ApiResponse<Object> response = new ApiResponse<Object>(
				HttpStatus.OK.toString(),
				SUCCESS,
				employeeService.saveEmployee(employees),
				null);
		return ResponseEntity.ok(response);
	}

	@PostMapping("/employee/detail")
	public ResponseEntity<?> create(@RequestBody EmployeeDetails employees) {
		ApiResponse<Object> response = new ApiResponse<>(
				HttpStatus.OK.toString(),
				SUCCESS,
				employeeService.createEmployeeDetail(employees),
				null);
		return ResponseEntity.ok(response);
	}

	@PutMapping("/employee/{empCode}/update")
	public ResponseEntity<ApiResponse<Object>> update(@RequestBody Employees employees, @PathVariable String empCode) {
		ApiResponse<Object> response = new ApiResponse<>(
				HttpStatus.OK.toString(),
				SUCCESS,
				employeeService.updateEmployee(empCode, employees),
				null);
		return ResponseEntity.ok(response);
	}

	@PutMapping("/employee/addUser")
	public ResponseEntity<ApiResponse<Object>> UserInto(@RequestBody addUserEmp username, @RequestParam String empCode) {
		ApiResponse<Object> response = new ApiResponse<>(
				HttpStatus.OK.toString(),
				SUCCESS,
				employeeService.addUser(username, empCode),
				null);
		return ResponseEntity.ok(response);
	}

	@GetMapping("/employees")
	public ResponseEntity<?> getList() {
		ApiResponse<Object> response = new ApiResponse<>(
				HttpStatus.OK.toString(),
				SUCCESS,
				employeeService.getListEmp(),
				null);
		return ResponseEntity.ok(response);
	}
}
