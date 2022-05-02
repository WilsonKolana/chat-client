package za.co.apexcrm.chatclient.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AccessibleAccounts{
    private List<Account> accessibleAccounts;

    public AccessibleAccounts(){
        accessibleAccounts = new ArrayList<>();
    }

    public void setAccessibleAccounts(List<Account> accessibleAccounts) {
        this.accessibleAccounts = accessibleAccounts;
    }

    public List<Account> getAccessibleAccounts() {
        return accessibleAccounts;
    }
}