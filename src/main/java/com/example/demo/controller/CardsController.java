package com.example.demo.controller;

import com.example.demo.CheckOutClient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cards")
public class CardsController {

    @RequestMapping(method = RequestMethod.POST, value = "authenticateUser")
    public String authenticateUser(@RequestParam String email, @RequestParam String password) {
        CheckOutClient ac = new CheckOutClient();
        return ac.doAuth(email, password).getReturn().getMensaje();
    }

    @RequestMapping(method = RequestMethod.POST, value = "getUser")
    public String getUser(@RequestParam String username, @RequestParam String email) throws Exception {
        CheckOutClient ac = new CheckOutClient();
        return ac.getUser(username, email).toString();
    }

    @RequestMapping(method = RequestMethod.POST, value = "getUserCards")
    public String getUserCards(@RequestParam String documentNumber, @RequestParam String auditoria,
            @RequestParam String email) throws Exception {
        CheckOutClient ac = new CheckOutClient();
        return ac.getUserCards(documentNumber, auditoria, email).toString();
    }

}