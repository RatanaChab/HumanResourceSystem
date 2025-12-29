package com.example.demo.Exception.HttpResponse;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiResponse<T> {
	private String status;
	private String message;
	private Object data;
	private Object metadata;

}
