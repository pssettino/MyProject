package com.hgp.myproject.core.exception;

/**
 * Created with IntelliJ IDEA.
 * User: BSBUON
 * Date: 29/04/14
 * Time: 12:09
 * To change this template use File | Settings | File Templates.
 */
public class UserNotFoundException extends Exception {

    public UserNotFoundException() {
        super("User not found");
    }
}
