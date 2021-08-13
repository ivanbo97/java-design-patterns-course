package com.ivanboyukliev.behavioralpatterns.command;

public class Client {
    public static void main(String[] args) {
        // create Receiver
        FileSystemReceiver fileSystemReceiver = FileSystemReceiverUtil.getUnderlyingFileSystem();

        // create the command with associated receiver
        Command openFileCommand = new OpenFileCommand(fileSystemReceiver);

        // creating the invoker and associate it with command
        FileInvoker fileInvoker = new FileInvoker(openFileCommand);

        // perform action on the invoker object
        fileInvoker.execute();

    }
}
