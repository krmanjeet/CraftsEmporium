package com.project.ElegantCraftsEmporium;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public String handleException(Exception e, Model model) {
        // Log the exception if necessary
    	model.addAttribute("errorMessage", e.getMessage());
        return "error"; // View name for a custom error page
    }
}
