package com.lisek.adapter;

public class Main {

    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new AudioPlayer();
        mediaPlayer.play("mp5", "pumped up kicks");

        MediaPlayer advancedMediaPlayerAdapter = new AdvancedMediaPlayerAdapter(new VlcPlayer());
        advancedMediaPlayerAdapter.play("mp3", "kek");

        MediaPlayer advancedMediaPlayerAdapter2 = new AdvancedMediaPlayerAdapter(new Mp4Player());
        advancedMediaPlayerAdapter2.play("mp5", "pumped up kicks");
    }
}
