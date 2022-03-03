package com.jx.restapiexample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class SalesCustomerNotFoundAdvice {

	  @ResponseBody
	  @ExceptionHandler(SalesCustomerNotFoundException.class)
	  @ResponseStatus(HttpStatus.NOT_FOUND)
	  String employeeNotFoundHandler(SalesCustomerNotFoundException ex) {
	    return ex.getMessage();
	  }
	  }
