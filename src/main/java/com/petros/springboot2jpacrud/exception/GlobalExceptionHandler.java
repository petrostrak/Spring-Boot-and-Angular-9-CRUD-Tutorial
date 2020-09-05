/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.petros.springboot2jpacrud.exception;

import java.util.Date;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;

/**
 *
 * @author petros
 */

@ControllerAdvice
public class GlobalExceptionHandler {
    
    /*
        To use ErrorDetails to return the error response, 
        let’s create a GlobalExceptionHandler class 
        annotated with @ControllerAdvice annotation. This 
        class handles exception specific and global exceptions 
        in a single place.

    */
    
    public ResponseEntity<?> resourceNotFoundException(ResourceNotFoundException ex, WebRequest request) {
        ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
