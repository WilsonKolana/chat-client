package za.co.apexcrm.chatclient.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class accountsController {

    @RequestMapping("/accounts")
    public String hello(){
        return "list of accessible accounts";
    }
}
