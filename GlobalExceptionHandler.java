package com.FitnessApplication.www.ExceptionHandling;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public String commonRuntime(Exception e) {
		
		return " An error occured :"+ e.getMessage();
	}
}
