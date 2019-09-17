package org.springframework.samples.petclinic.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class WelcomeController {

    @RequestMapping("/")
    public String welcome() {
        return "welcome";
    }
}
