package com.posterr.postservice.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class ControllerExceptionHandler {

    private static final Logger LOG = LoggerFactory.getLogger(ControllerExceptionHandler.class);

    @ExceptionHandler(Throwable.class)
    public ResponseEntity<ResponseError> generalError(Throwable throwable, HttpServletRequest request) {
        ResponseError responseError = new ResponseError();
        responseError.setTimestamp(System.currentTimeMillis());
        HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
        responseError.setStatus(httpStatus);
        responseError.setMessage("Invalid request: ".concat(throwable.getMessage()));
        LOG.error(throwable.getMessage(), throwable);
        return ResponseEntity.status(httpStatus).body(responseError);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ResponseError onConstraintValidationException(ConstraintViolationException e) {
        ResponseError error = new ResponseError();
        error.setTimestamp(System.currentTimeMillis());
        HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
        error.setStatus(httpStatus);
        error.setMessage(e.getMessage());
        LOG.error(e.getMessage(), e);
        if (e.getConstraintViolations() == null)
            return error;
        for (ConstraintViolation<?> violation : e.getConstraintViolations()) {
            error.setMessage(error.getMessage() + "; " + violation.getMessage());
        }
        return error;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ResponseError onMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        ResponseError error = new ResponseError();
        error.setTimestamp(System.currentTimeMillis());
        HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
        error.setStatus(httpStatus);
        LOG.error(e.getMessage(), e);
        for (FieldError fieldError : e.getFieldErrors()) {
            error.setMessage(error.getMessage().concat("["+fieldError.getField()+": " + fieldError.getDefaultMessage())+"] ");
        }
        return error;
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResponseError> handleGeneralError(Exception ex) {
        ResponseError responseError = new ResponseError();
        responseError.setTimestamp(System.currentTimeMillis());
        HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
        responseError.setStatus(httpStatus);
        responseError.setMessage("Invalid request: ".concat(ex.getMessage()));
        LOG.error(ex.getMessage(), ex);
        return ResponseEntity.status(httpStatus).body(responseError);
    }
}
