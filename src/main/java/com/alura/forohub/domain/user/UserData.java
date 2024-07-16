package com.alura.forohub.domain.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UserData(
        @NotBlank
        @Email
        String email,
        @NotBlank
        String password
) {
}