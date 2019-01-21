package com.gonnect.email.api;

import com.gonnect.email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
public class EmailApi {
    @Autowired
    private EmailService emailService;

    @RequestMapping(value = "/emailsender" , method = RequestMethod.GET)
    public void sendEmail(){
        try {
            emailService.sendMail("Thomas.DeWinter@nike.com", "Test Subject", "TestMessage");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
