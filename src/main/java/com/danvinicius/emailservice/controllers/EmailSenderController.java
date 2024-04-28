package com.danvinicius.emailservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danvinicius.emailservice.application.EmailSenderService;
import com.danvinicius.emailservice.core.dtos.EmailRequestDTO;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/email")
public class EmailSenderController {

    @Autowired
    private EmailSenderService emailSenderService;

    @PostMapping
    public ResponseEntity<String> sendEmail(@RequestBody @Valid EmailRequestDTO emailRequest) {
        this.emailSenderService.sendEmail(emailRequest.to(), emailRequest.subject(), emailRequest.body());
        return ResponseEntity.status(HttpStatus.OK).body("E-mail sent successfully");
    }
}
