package com.lisek.adapter;

public class AdvancedMediaPlayerAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public AdvancedMediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    public void play(String audioType, String fileName) {
        advancedMediaPlayer.loadFilename(fileName);
        advancedMediaPlayer.listen();
    }
}
