package com.ivanboyukliev.behavioralpatterns.command;

public class FileSystemReceiverUtil {
    public static FileSystemReceiver getUnderlyingFileSystem() {
        String osName = System.getProperty("os.name");
        System.out.println("Underlying OS: " + osName);
        if (osName.contains("Windows")) {
            return new WindowsFileSystemReceiver();
        }
        if (osName.contains("Unix")) {
            return new UnixFileSystemReceiver();
        }
        System.out.println("There is no filesystem support for current OS.");
        return null;
    }
}
