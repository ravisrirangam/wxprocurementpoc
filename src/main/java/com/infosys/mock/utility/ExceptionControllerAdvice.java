package com.infosys.mock.utility;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

import javax.validation.ConstraintViolationException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.infosys.mock.exception.MockException;




@RestControllerAdvice
public class ExceptionControllerAdvice {
	@Autowired
	Environment environment;

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorInfo> exceptionHandler(Exception exception) {
		ErrorInfo error = new ErrorInfo();
		
		error.setErrorMessage(environment.getProperty("General.EXCEPTION_MESSAGE"));
		error.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		error.setTimestamp(LocalDateTime.now());
		return new ResponseEntity<ErrorInfo>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	
	
	 
//		@ExceptionHandler(ConstraintViolationException.class)
//		public ResponseEntity<ErrorInfo> pathExceptionHandler(ConstraintViolationException exception) {
//	 
//			ErrorInfo errorInfo = new ErrorInfo();
//			errorInfo.setErrorCode(HttpStatus.BAD_REQUEST.value());
//	 
//			String errorMsg = exception.getConstraintViolations().stream().map(x -> x.getMessage())
//					.collect(Collectors.joining(", "));
//			errorInfo.setErrorMessage(errorMsg);
//			errorInfo.setTimestamp(LocalDateTime.now());
//			return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
//		}
		
		}
//		@ExceptionHandler(MockException.class)
//		public ResponseEntity<ErrorInfo> mockExceptionHandler(MockException exception) {
//			ErrorInfo error = new ErrorInfo();
//			String e = environment.getProperty(exception.getMessage());
//			error.setErrorMessage(e);
//			error.setTimestamp(LocalDateTime.now());
//			error.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
//	 
//			return new ResponseEntity<ErrorInfo>(error, HttpStatus.INTERNAL_SERVER_ERROR);
//		}
		
		
		
		
		
	
		
		
		
	
	

