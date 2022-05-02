package za.co.apexcrm.chatclient.domain;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Login {
    private String username;
    private List<String> roles; 

    @JsonProperty("token_type")
    private String tokenType;

    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("refresh_token")
    private String refreshToken;

    @JsonProperty("expires_in")
    private int expiresIn;

    public Login(){

    }

    public String getUsername(){
        return username;
    }

    public List<String> getRoles(){
        return roles;
    }

    public String getTokenType(){
        return tokenType;
    }

    public String getAccessToken(){
        return accessToken;
    }

    public String getRefreshToken(){
        return refreshToken;
    }

    public int getExpiresIn(){
        return expiresIn;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setRoles(List<String> roles){
        this.roles = roles;
    }

    public void setTokenType(String tokenType){
        this.tokenType = tokenType;
    }

    public void setAcessToken(String accessToken){
        this.accessToken = accessToken;
    }

    public void setRefreshToken(String refreshToken){
        this.refreshToken = refreshToken;
    }

    public void setExpiresIn(int expiresIn){
        this.expiresIn = expiresIn;
    }

}