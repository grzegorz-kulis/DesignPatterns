package com.lisek.adapter;

public class Mp4Player implements AdvancedMediaPlayer {
    private String filename;

    public void loadFilename(String filename) {
        this.filename = filename;
    }

    public void listen() {
        System.out.println("Listening on Mp4 Player to " + this.filename);
    }
}
