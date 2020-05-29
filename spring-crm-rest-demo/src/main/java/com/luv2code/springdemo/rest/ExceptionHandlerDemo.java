package com.luv2code.springdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerDemo {

    @ExceptionHandler
    public ResponseEntity<CustomerEntityResponse> handleException(CustomerNotFound exc){
        CustomerEntityResponse error = new CustomerEntityResponse(HttpStatus.NOT_FOUND.value(), exc.getMessage(),
                                                                System.currentTimeMillis());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<CustomerEntityResponse> handleException(Exception exc){
        CustomerEntityResponse error = new CustomerEntityResponse(HttpStatus.BAD_REQUEST.value(),exc.getMessage(),
                System.currentTimeMillis());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

}
