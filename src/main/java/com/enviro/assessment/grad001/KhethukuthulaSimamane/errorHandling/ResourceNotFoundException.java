package com.enviro.assessment.grad001.KhethukuthulaSimamane.errorHandling;

/**
 * Custom exception class for indicating that a requested resource was not found.
 */
public class ResourceNotFoundException extends RuntimeException {
    /**
     * Constructs a new ResourceNotFoundException with the specified detail message.
     *
     * @param message the detail message
     */
    public ResourceNotFoundException(String message) {
        super(message);
    }


}
