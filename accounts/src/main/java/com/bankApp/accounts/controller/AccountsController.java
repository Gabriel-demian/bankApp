package com.bankApp.accounts.controller;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EntityScan("com.bankApp.accounts.entity")
public class AccountsController {

    @GetMapping("sayHelo")
    public String sayHi(){
        return "Hi hiiii";
    }
}
