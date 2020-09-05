/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.petros.springboot2jpacrud.exception;

import java.util.Date;

/**
 *
 * @author petros
 */
public class ErrorDetails {
    /*
        The default error response provided by Spring Boot 
        contains all the details that are typically needed.
        However, you might want to create a framework inde-
        pendent response structure for your organization. 
        In that case, you can define a specific error 
        response structure.
    */
    
    private Date timestamp;
    private String message;
    private String details;
    
    public ErrorDetails(Date timestamp, String message, String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }
    
    public Date getTimestamp() {
        return timestamp;
    }
    
    public String getMessage() {
        return message;
    }
    
    public String getDetails() {
        return details;
    }
}
