package com.lisek.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {

    private String filename;

    public void loadFilename(String filename) {
        this.filename = filename;
    }

    public void listen() {
        System.out.println("Listening on VLC Player to " + this.filename);
    }
}
