package com.hgp.myproject.core.exception;


/**
 * PGSETT
 * Exception de tipo checked que lanzara cualquier error
 * ocurrido en los Services
 */
public class BusinessException extends Exception {


    public BusinessException() {
    }


    public BusinessException(String message) {
        super(message);
    }


    public BusinessException(Throwable cause) {
        super(cause);
    }


    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

}
