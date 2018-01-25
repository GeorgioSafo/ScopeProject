package ru.example.scopeproject;

import javax.inject.Singleton;

import dagger.Component;
import ru.example.scopeproject.api.ApiModule;
import ru.example.scopeproject.login.LoginActivityComponent;
import ru.example.scopeproject.mail.MailComponent;
import ru.example.scopeproject.mail.MailModule;

@Singleton
@Component(modules = {ApiModule.class})
public interface AppComponent {

    LoginActivityComponent createLoginComponent();

    MailComponent createMailComponent(MailModule mailModule);
}
