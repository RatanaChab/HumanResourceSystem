package com.example.demo.Exception;

import org.springframework.http.HttpStatus;


public class DataIntegrityException extends ApiException {

	public DataIntegrityException(String resourceName, String e) {
		super(HttpStatus.BAD_REQUEST, String.format("%s in Bank Entity = %s Duplicate", resourceName, e));
	}


}
