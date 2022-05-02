package za.co.apexcrm.chatclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import za.co.apexcrm.chatclient.domain.AccessibleAccounts;

@SpringBootApplication
public class ChatClientApplication {
    public static String token;
    public static AccessibleAccounts accessibleAccounts;
	public static String chatBaseUrl = "https://chat-api.alpha.apexvisibility.co";

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		accessibleAccounts = new AccessibleAccounts();
		SpringApplication.run(ChatClientApplication.class, args);
	}

}
