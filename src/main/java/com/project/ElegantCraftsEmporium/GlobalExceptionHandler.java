package com.project.ElegantCraftsEmporium;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public String handleException(Exception e) {
        // Log the exception if necessary
        return "error"; // View name for a custom error page
    }
}
