package com.danvinicius.emailservice.core.usecases;

public interface EmailSenderUseCase {
    void sendEmail(String to, String subject, String body);
}
