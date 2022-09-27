package com.Users.custom_exception;

/*
 * Custom exception that prints a message when a resource or ID is not found
 */
public class ResourceNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(String msg) {
      super(msg);
    }
}