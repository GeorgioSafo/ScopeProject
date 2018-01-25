package ru.example.scopeproject.folders;

import dagger.Subcomponent;
import ru.example.scopeproject.ActivityScope;

@ActivityScope
@Subcomponent(modules = FolderListActivityModule.class)
public interface FolderListActivityComponent {

    void injectFoldersListActivity(FolderListActivity activity);

}
