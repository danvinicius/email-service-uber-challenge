package com.danvinicius.emailservice.infra;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.danvinicius.emailservice.core.exceptions.EmailServiceException;

import jakarta.validation.UnexpectedTypeException;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(EmailServiceException.class)
    private ResponseEntity<RestErrorMessage> emailServiceHandler(EmailServiceException exception) {
        Integer status = HttpStatus.INTERNAL_SERVER_ERROR.value();
        RestErrorMessage errorMessage = new RestErrorMessage(status, exception.getMessage());
        return ResponseEntity.status(status).body(errorMessage);
    }

    @ExceptionHandler(UnexpectedTypeException.class)
    private ResponseEntity<RestErrorMessage> unexpectedTypeHandler(UnexpectedTypeException exception) {
        Integer status = HttpStatus.BAD_REQUEST.value();
        RestErrorMessage errorMessage = new RestErrorMessage(status, exception.getMessage());
        return ResponseEntity.status(status).body(errorMessage);
    }

    @ExceptionHandler(RuntimeException.class)
    private ResponseEntity<RestErrorMessage> runTimeExceptionHandler(RuntimeException exception) {
        Integer status = HttpStatus.INTERNAL_SERVER_ERROR.value();
        RestErrorMessage errorMessage = new RestErrorMessage(status, exception.getMessage());
        return ResponseEntity.status(status).body(errorMessage);
    }
}