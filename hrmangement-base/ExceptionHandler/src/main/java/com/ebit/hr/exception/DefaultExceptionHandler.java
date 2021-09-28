package com.ebit.hr.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class DefaultExceptionHandler  extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ErrorMessage> someThingWentWrong(Exception ex){
		ErrorMessage exceptionResponse = new ErrorMessage(ex.getMessage());
		
		return new ResponseEntity<ErrorMessage>(exceptionResponse, new HttpHeaders(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
class ErrorMessage{
	private String message;
	
	
	public ErrorMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ErrorMessage(String message) {
		super();
		this.message = message;
		
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
}