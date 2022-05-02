package za.co.apexcrm.chatclient.controllers;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import za.co.apexcrm.chatclient.domain.Chat;
import za.co.apexcrm.chatclient.domain.Login;

import java.util.List;

import static za.co.apexcrm.chatclient.ChatClientApplication.*;

@RestController
public class ChatsController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/chats/latest")
    public String latestChat() throws ParseException {
        int firstAccountId = accessibleAccounts.getAccessibleAccounts().get(0).getId();

        String url = chatBaseUrl + "/api/chat/" + firstAccountId + "?sort=lastUpdated";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", "Bearer " + token);
        HttpEntity<String> request = new HttpEntity<>(headers);

        //Need a simpler way to parse an unnamed jsonArray into a POJO
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, request, String.class);
        JSONParser jsonParser = new JSONParser();
        JSONArray jsonArray = (JSONArray) jsonParser.parse(response.getBody());
        JSONObject jsonObject = (JSONObject) jsonArray.get(0);
        latestChatId = Integer.parseInt(jsonObject.get("id").toString());
        latestTags = (List<String>) jsonObject.get("tags");
        String chatName = jsonObject.get("name").toString();
        String lastUpdated = jsonObject.get("lastUpdated").toString();


        return "The latest chat was named: " +chatName+ "and it was last updated on: " +lastUpdated;
    }

    @PostMapping("/chats/latest/{tag}")
    public String tagLatest(@PathVariable String tag){
        int firstAccountId = accessibleAccounts.getAccessibleAccounts().get(0).getId();

        String url = chatBaseUrl + "/api/chat/" +firstAccountId+"/tag/" +latestChatId;
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", "Bearer " + token);

        JSONObject requestBody = new JSONObject();
        latestTags.add(tag);
        requestBody.put("tags", latestTags);

        HttpEntity<String> request = new HttpEntity<>(requestBody.toString(), headers);

        ResponseEntity<Chat> response = restTemplate.postForEntity( url, request , Chat.class );
        return "Added a tag to chat no: " +latestChatId+ "Here are the new tags: \n" +response.getBody().getTags();
    }

}
