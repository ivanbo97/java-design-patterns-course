package com.ivanboyukliev.structuralpatterns.adapter.courseassignment;

public class Mp4Player implements AdvanceMediaPlayer {
    private String fileName;

    @Override
    public void loadFileName(String fileName) {
            this.fileName = fileName;
    }

    @Override
    public void listen() {
        if(fileName != null) {
            System.out.println("Listening to : " + fileName);
            return;
        }
        System.out.println("There is no file loaded in MP4 Player");
    }
}
