package com.tessel.exception;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	
	public ResponseEntity<ErrorResponse> handleValidation(MethodArgumentNotValidException ex)
	{
		Map<String,String> errors=new LinkedHashMap<>();
		
		ex.getBindingResult().getFieldErrors().forEach(e->errors.put(e.getField(),e.getDefaultMessage()));
		
		return ResponseEntity.badRequest().body(new ErrorResponse(400,"Validation failed",errors));
	}
	
	
	public ResponseEntity<ErrorResponse>handleStatus(ResponseStatusException ex)
	{
		return ResponseEntity.status(ex.getStatusCode()).body(new ErrorResponse(ex.getStatusCode().value(),ex.getReason(),Map.of()));
		
	}

}
