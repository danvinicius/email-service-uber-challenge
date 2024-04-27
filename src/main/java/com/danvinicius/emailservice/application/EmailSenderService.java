package com.danvinicius.emailservice.application;

import com.danvinicius.emailservice.adapters.EmailSenderGateway;
import com.danvinicius.emailservice.core.usecases.EmailSenderUseCase;

public class EmailSenderService implements EmailSenderUseCase {

    private final EmailSenderGateway emailSenderGateway;

    public EmailSenderService(EmailSenderGateway emailSenderGateway) {
        this.emailSenderGateway = emailSenderGateway;
    }

    @Override
    public void sendEmail(String to, String subject, String body) {
        emailSenderGateway.sendEmail(to, subject, body);
    }
    
}
