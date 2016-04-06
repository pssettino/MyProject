package com.hgp.myproject.core.exception;

/**
 * Created by PGSETT on 04/06/2014.
 */
public class DataAccessException extends Exception {

    public DataAccessException() {
    }


    public DataAccessException(String message) {
        super(message);
    }


    public DataAccessException(Throwable cause) {
        super(cause);
    }


    public DataAccessException(String message, Throwable cause) {
        super(message, cause);
    }
}
