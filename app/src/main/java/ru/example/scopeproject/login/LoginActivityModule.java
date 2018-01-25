package ru.example.scopeproject.login;

import dagger.Module;
import dagger.Provides;
import ru.example.scopeproject.ActivityScope;
import ru.example.scopeproject.account.AccountManager;
import ru.example.scopeproject.api.ApiService;

@Module
public class LoginActivityModule {

    @ActivityScope
    @Provides
    AccountManager provideAccountManager(ApiService apiService) {
        return new AccountManager(apiService);
    }

    @ActivityScope
    @Provides
    LoginActivityPresenter provideLoginActivityPresenter(AccountManager accountManager) {
        return new LoginActivityPresenter(accountManager);
    }

}
