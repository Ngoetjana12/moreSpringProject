package org.mecerintered.morespringproject.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record StudentRequest(

        @NotBlank(message = "First name is required")
        @Size(max = 30, message = "First name must not exceed 30 characters")
        String firstName,

        @NotBlank(message = "Last name is required")
        @Size(max = 30, message = "Last name must not exceed 30 characters")
        String lastName,

        @NotBlank(message = "First name is required")
        @Email(message = "Enter a valid email address")
        @Size(max = 50, message = "Email must not exceed 50 characters")
        String email
) {
}
