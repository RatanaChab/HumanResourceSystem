package com.example.demo.Exception;

import com.example.demo.Exception.HttpResponse.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ApiException.class)
	public ResponseEntity<ApiResponse<Object>> handleResourceNotFound(ApiException ex) {
		ApiResponse<Object> response = new ApiResponse<>(
				ex.getHttpStatus().toString(),
				ex.getMessage(),
				null,
				null
		);
		return ResponseEntity.status(ex.getHttpStatus()).body(response);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ApiResponse<Object>> handleValidationErrors(MethodArgumentNotValidException ex) {
		ApiResponse<Object> response = new ApiResponse<>(
				ex.getStatusCode().toString(),
				ex.getBindingResult().getFieldErrors().getFirst().getDefaultMessage(),
				null,
				null
		);
		return ResponseEntity.ok(response);
	}

}