package ru.example.scopeproject.folders;

import ru.example.scopeproject.mail.MailManager;

public class FolderListActivityPresenter {

    private FolderListActivity activity;
    private MailManager mailManager;

    FolderListActivityPresenter(MailManager mailManager) {
        this.mailManager = mailManager;
    }

    public void setActivity(FolderListActivity activity) {
        this.activity = activity;
    }

    public void loadFolders() {
        activity.showFolders(mailManager.getFolders());
    }
}

