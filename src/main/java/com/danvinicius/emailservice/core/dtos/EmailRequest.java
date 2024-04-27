package com.danvinicius.emailservice.core.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record EmailRequest(
    @Email(message = "'to' field must be an e-mail") @NotNull(message = "'to' field must not be null") String to,
    @NotNull(message = "'subject' field must not be null") String subject,
    @NotNull(message = "'body' field must not be null") String body) {
}
