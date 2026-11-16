package org.mecerintered.morespringproject.DTO;

public record StudentResponse(
        Long id,
        String firstName,
        String lastName,
        String email
) {
}
