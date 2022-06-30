package com.posterr.postservice.exceptions;

import org.springframework.http.HttpStatus;

import java.io.Serial;
import java.io.Serializable;

public class ResponseError implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private Long timestamp;
    private HttpStatus status;
    private String message;
    private Object data;

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
