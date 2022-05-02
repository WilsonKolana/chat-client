package za.co.apexcrm.chatclient.domain;

import java.util.List;
public class AccessibleAccounts{
    private List<Account> accessibleAccounts;

    public AccessibleAccounts(){

    }

    public void setAccessibleAccounts(List<Account> accessibleAccounts) {
        this.accessibleAccounts = accessibleAccounts;
    }

    public List<Account> getAccessibleAccounts() {
        return accessibleAccounts;
    }
}