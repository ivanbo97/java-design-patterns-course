package com.ivanboyukliev.structuralpatterns.adapter.courseassignment;

public class AdvancedMediaPlayerAdapter implements MediaPlayer {
    //Adaptee
    AdvanceMediaPlayer advanceMediaPlayer;

    public AdvancedMediaPlayerAdapter(AdvanceMediaPlayer advanceMediaPlayer) {
        this.advanceMediaPlayer = advanceMediaPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        advanceMediaPlayer.loadFileName(fileName);
        advanceMediaPlayer.listen();
    }
}
