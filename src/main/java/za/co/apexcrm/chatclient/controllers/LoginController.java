package za.co.apexcrm.chatclient.controllers;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import za.co.apexcrm.chatclient.domain.Login;
import za.co.apexcrm.chatclient.domain.User;

import static za.co.apexcrm.chatclient.ChatClientApplication.chatBaseUrl;
import static za.co.apexcrm.chatclient.ChatClientApplication.token;

@RestController
public class LoginController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/login")
    public String login(){
        String url = chatBaseUrl + "/api/login";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        JSONObject loginBody = new JSONObject();
        loginBody.put("username", "makoaewilson@gmail.com");
        loginBody.put("password", "tOiiNjBjdiePgGBsratPMZvA");

        HttpEntity<String> request = new HttpEntity<>(loginBody.toString(), headers);

        ResponseEntity<Login> response = restTemplate.postForEntity( url, request , Login.class );
        token = response.getBody().getAccessToken();
        return "logged in with " + response.getBody().getUsername();
    }
}
