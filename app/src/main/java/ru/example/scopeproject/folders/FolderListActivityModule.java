package ru.example.scopeproject.folders;


import dagger.Module;
import dagger.Provides;
import ru.example.scopeproject.ActivityScope;
import ru.example.scopeproject.mail.MailManager;

@Module
public class FolderListActivityModule {

    @ActivityScope
    @Provides
    public FolderListActivityPresenter provideFoldersListActivityPresenter(MailManager mailManager) {
        return new FolderListActivityPresenter(mailManager);
    }
}
