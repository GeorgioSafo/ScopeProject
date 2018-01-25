package ru.example.scopeproject.account;

import ru.example.scopeproject.api.ApiService;
import ru.example.scopeproject.datatype.Account;

public class AccountManager {

    private ApiService apiService;

    public AccountManager(ApiService apiService) {
        this.apiService = apiService;
    }

    public Account login(String user, String password) {
        return apiService.login(user, password);
    }

}
