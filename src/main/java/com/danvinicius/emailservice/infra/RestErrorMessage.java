package com.danvinicius.emailservice.infra;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RestErrorMessage {
    private Integer status;
    private String message;
}