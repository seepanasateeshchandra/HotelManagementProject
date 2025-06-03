package com.example.InterFace.Web.ExceptionHandler;

import java.util.NoSuchElementException;

import org.springframework.boot.AotInitializerNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	
	

	    // Handle specific exceptions
	    @ExceptionHandler(NoSuchElementException.class)
	    public ResponseEntity<ApiError> handleResourceNotFound(NoSuchElementException ex) {
	        ApiError error = new ApiError(HttpStatus.NOT_FOUND, "Element Not Found in Database! Please Provide valid Id");
	        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	    }

	    // Handle bad requests
	    @ExceptionHandler(IllegalArgumentException.class)
	    public ResponseEntity<ApiError> handleBadRequest(IllegalArgumentException ex) {
	        ApiError error = new ApiError(HttpStatus.BAD_REQUEST, ex.getMessage());
	        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	    }

	    // Handle generic exceptions
	    @ExceptionHandler(Exception.class)
	    public ResponseEntity<ApiError> handleAll(Exception ex) {
	        ApiError error = new ApiError(HttpStatus.INTERNAL_SERVER_ERROR, "Unexpected error occurred");
	        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	

}
