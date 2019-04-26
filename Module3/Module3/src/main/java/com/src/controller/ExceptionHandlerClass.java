package com.src.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.src.model.ErrorViews;
import com.src.utility.IDNotFoundException;


@ControllerAdvice
@RestController
public class ExceptionHandlerClass extends ResponseEntityExceptionHandler {
	@ExceptionHandler(value = IDNotFoundException.class)
	 public final ResponseEntity<ErrorViews> handleNotFoundException(IDNotFoundException ex, WebRequest request) {
		com.src.model.ErrorViews errorDetails = new ErrorViews(new Date(), ex.getMessage(),
		        request.getDescription(false));
		    return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	   }
	
}
