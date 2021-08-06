package com.ivanboyukliev.structuralpatterns.adapter.courseassignment;

public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase(".mp3")){
            System.out.println("Audio Player is playing audio type: " + audioType + ", File Name: " + fileName);
            return;
        }
        System.out.println("Not supported format for audio player.");
    }
}
