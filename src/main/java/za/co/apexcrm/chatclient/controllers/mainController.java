package za.co.apexcrm.chatclient.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {

    @RequestMapping("/")
    public String hello(){
        return "hello";
    }
}
