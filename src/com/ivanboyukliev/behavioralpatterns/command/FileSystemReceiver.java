package com.ivanboyukliev.behavioralpatterns.command;

public interface FileSystemReceiver {
    void openFile();
    void writeFile();
    void closeFile();
}
