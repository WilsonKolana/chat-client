package za.co.apexcrm.chatclient.controllers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import za.co.apexcrm.chatclient.domain.AccessibleAccounts;
import za.co.apexcrm.chatclient.domain.Account;

import java.util.List;

import static za.co.apexcrm.chatclient.ChatClientApplication.*;

@RestController
public class AccountsController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/accounts")
    public String listAccessibleAccounts() throws ParseException {
        String url = chatBaseUrl + "/api/account";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", "Bearer " + token);
        HttpEntity<String> request = new HttpEntity<>(headers);

        //Need a simpler way to parse an unnamed jsonArray into a POJO
        ResponseEntity<String> response = restTemplate.exchange( url, HttpMethod.GET, request , String.class);
        JSONParser jsonParser = new JSONParser();
        JSONArray jsonArray = (JSONArray) jsonParser.parse(response.getBody());

        for (int i = 0; i < jsonArray.size(); i++) {
           JSONObject jsonObject = (JSONObject) jsonArray.get(i);
           int id = Integer.parseInt(jsonObject.get("id").toString());
           Account account = new Account(id, jsonObject.get("name").toString(), jsonObject.get("topic").toString());
           accessibleAccounts.getAccessibleAccounts().add(account);
        }

        return jsonArray.toString();
    }
}
