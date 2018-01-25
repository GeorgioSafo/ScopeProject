package ru.example.scopeproject.letters;

import dagger.Subcomponent;
import ru.example.scopeproject.ActivityScope;

@ActivityScope
@Subcomponent(modules = LetterListActivityModule.class)
public interface LetterListActivityComponent {

    void injectLettersListActivity(LetterListActivity activity);

}
