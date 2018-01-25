package ru.example.scopeproject.login;

import javax.inject.Inject;

import ru.example.scopeproject.account.AccountManager;
import ru.example.scopeproject.datatype.Account;

public class LoginActivityPresenter {

    private LoginActivity activity;

    @Inject
    private AccountManager accountManager;

    @Inject
    public LoginActivityPresenter(AccountManager accountManager) {
        this.accountManager = accountManager;
    }

    public void setActivity(LoginActivity activity) {
        this.activity = activity;
    }

    void login(String user, String password) {
        Account account = accountManager.login(user, password);
        activity.showMailForAccount(account);
    }

}
