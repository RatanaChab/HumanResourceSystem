package com.example.demo.AnnualLeave;

import com.example.demo.AnnualLeave.DTO.leaveRegisterDTO;
import com.example.demo.Exception.HttpResponse.ApiResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/leaves")
@AllArgsConstructor
public class AnnualController {

	private static final String SUCCESS = "Successfully";

	private final AnnualService annualMgtService;

	@PostMapping("/register")
	public ResponseEntity<?> create(@RequestBody leaveRegisterDTO leaveDTO) {
		ApiResponse<Object> response = new ApiResponse<>(
				HttpStatus.OK.toString(),
				SUCCESS,
				annualMgtService.register(leaveDTO),
				null);
		return ResponseEntity.ok(response);
	}
}
