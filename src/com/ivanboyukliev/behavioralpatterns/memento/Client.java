package com.ivanboyukliev.behavioralpatterns.memento;

public class Client {
    public static void main(String[] args) {

        // Caretaker
        FileWriterCaretaker fileWriterCaretaker = new FileWriterCaretaker();

        // Originator
        FileWriterUtil fileWriterUtil = new FileWriterUtil("data.txt");
        fileWriterUtil.write("First Set of Data:\nMaria\nGergana");

        System.out.println(fileWriterUtil + "\n\n");

        fileWriterCaretaker.save(fileWriterUtil);

        fileWriterUtil.write("Second Set of Data:\nIvan\nDimitar");
        System.out.println(fileWriterUtil + "\n\n");

        //undo to last save
        fileWriterCaretaker.undo(fileWriterUtil);

        System.out.println("Last Restore Point Content:");
        System.out.println(fileWriterUtil + "\n\n");
    }
}
