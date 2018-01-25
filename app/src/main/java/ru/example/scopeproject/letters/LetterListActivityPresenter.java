package ru.example.scopeproject.letters;


import ru.example.scopeproject.datatype.Folder;
import ru.example.scopeproject.mail.MailManager;

public class LetterListActivityPresenter {

    private LetterListActivity activity;
    private Folder folder;
    private MailManager mailManager;

    public LetterListActivityPresenter(Folder folder, MailManager mailManager) {
        this.folder = folder;
        this.mailManager = mailManager;
    }

    public void setActivity(LetterListActivity activity) {
        this.activity = activity;
    }

    public void loadLetters() {
        activity.showLetters(mailManager.getLetters(folder));
    }
}
