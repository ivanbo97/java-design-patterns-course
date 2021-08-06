package com.ivanboyukliev.structuralpatterns.adapter.courseassignment;

public class VlcPlayer implements AdvanceMediaPlayer {
    private String fileName;

    @Override
    public void loadFileName(String fileName) {
        if(fileName.contains(".vlc")) {
            this.fileName = fileName;
            return;
        }
        System.out.println("Vlc Player Error: Not supported file format");
    }

    @Override
    public void listen() {
        if(fileName != null) {
            System.out.println("Listening to : " + fileName);
            return;
        }
        System.out.println("There is no file loaded in Vlc Player");
    }
}
