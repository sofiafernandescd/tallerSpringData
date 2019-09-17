package org.springframework.samples.petclinic.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class SimpleController {
	// captura la excepcepción indicada en cualquiera de los métodos
		
	
	/*public final String handleException(Exception ex) {  
		if(ex instanceof IOException) {
			return "IOEXCEPTION!!!!";
		} else if (ex instanceof NullPointerException) {
			return "NULL POINTER!!!!!!!";
		} //...etc
		return ex.getMessage();
    }*/
	
	@ExceptionHandler(IOException.class)
	public String handleIOException(IOException ex, HttpServletRequest request) {
	    return "###EXCEÇAO COSTUMIZADA";
	 }
	 @ExceptionHandler(Exception.class)
	 public String handleException(Exception ex, HttpServletRequest request) {
	    return "###EXCEÇAO COSTUMIZADA";
	  }


}
