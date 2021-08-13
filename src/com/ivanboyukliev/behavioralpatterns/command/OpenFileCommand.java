package com.ivanboyukliev.behavioralpatterns.command;

public class OpenFileCommand implements Command {
    private FileSystemReceiver fileSystemReceiver;

    //we could store the previous state of the receiver if we had undo/redo methods


    public OpenFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        fileSystemReceiver.openFile();
        // Here we can save the previous state if we had undo/redo methods
    }
}
