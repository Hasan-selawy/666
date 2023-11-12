package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Dealer {

    private EmailService emailService;
    @Autowired
    public Dealer(EmailService emailService) {
        this.emailService = emailService;
    }
}
