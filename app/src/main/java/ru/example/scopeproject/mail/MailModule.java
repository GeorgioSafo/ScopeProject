package ru.example.scopeproject.mail;

import dagger.Module;
import dagger.Provides;
import ru.example.scopeproject.api.ApiService;
import ru.example.scopeproject.datatype.Account;

@Module
public class MailModule {

    private Account account;

    public MailModule(Account account) {
        this.account = account;
    }

    @Provides
    public Account provideAccount() {
        return account;
    }

    @Provides
    @MailScope
    MailManager provideMailManager(Account account, ApiService apiService) {
        return new MailManager(account, apiService);
    }

}
