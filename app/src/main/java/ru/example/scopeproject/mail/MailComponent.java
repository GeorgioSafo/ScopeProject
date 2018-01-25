package ru.example.scopeproject.mail;

import dagger.Subcomponent;
import ru.example.scopeproject.folders.FolderListActivityComponent;
import ru.example.scopeproject.letters.LetterListActivityComponent;
import ru.example.scopeproject.letters.LetterListActivityModule;

@MailScope
@Subcomponent(modules = MailModule.class)
public interface MailComponent {

    FolderListActivityComponent createFoldersListActivityComponent();

    LetterListActivityComponent createLetterListActivityComponent(LetterListActivityModule letterListActivityModule);

}
