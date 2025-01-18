package com.enviro.assessment.grad001.KhethukuthulaSimamane.errorHandling;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * These class models the error response format for you
 * It gives the error response a structure with status and message
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {
    private int status;
    private String message;
}
