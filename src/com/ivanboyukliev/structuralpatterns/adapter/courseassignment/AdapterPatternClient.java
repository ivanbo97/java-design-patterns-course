package com.ivanboyukliev.structuralpatterns.adapter.courseassignment;

public class AdapterPatternClient {
    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play(".mp3","jasonMusic.mp3");

        AdvanceMediaPlayer mp4Player = new Mp4Player();
        MediaPlayer advancedMediaPlayerAdapter = new AdvancedMediaPlayerAdapter(mp4Player);
        audioPlayer.play(".mp4","unknown.mp4");

    }
}
