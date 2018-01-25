package ru.example.scopeproject.letters;

import dagger.Module;
import dagger.Provides;
import ru.example.scopeproject.ActivityScope;
import ru.example.scopeproject.datatype.Folder;
import ru.example.scopeproject.mail.MailManager;

@Module
public class LetterListActivityModule {

    private Folder folder;

    public LetterListActivityModule(Folder folder) {
        this.folder = folder;
    }

    @ActivityScope
    @Provides
    public Folder provideFolder() {
        return folder;
    }

    @ActivityScope
    @Provides
    public LetterListActivityPresenter provideLettersListActivityPresenter(Folder folder, MailManager mailManager) {
        return new LetterListActivityPresenter(folder, mailManager);
    }
}
