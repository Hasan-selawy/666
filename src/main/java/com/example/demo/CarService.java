package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class CarService {




     private Maintenance maintenance;
     private EmailService emailService;
     private Dealer dealer;
     @Autowired
     public CarService(Maintenance maintenance,
                       EmailService emailService,
                       Dealer dealer){

         this.maintenance=maintenance;
         this.emailService=emailService;
         this.dealer = dealer;
     }
}
