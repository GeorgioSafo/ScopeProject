package ru.example.scopeproject.login;

import dagger.Subcomponent;
import ru.example.scopeproject.ActivityScope;

@ActivityScope
@Subcomponent(modules = LoginActivityModule.class)
public interface LoginActivityComponent {

    void injectLoginActivity(LoginActivity activity);

}
