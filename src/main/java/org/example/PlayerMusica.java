package org.example;

public class PlayerMusica {
    private static PlayerMusica instance = new PlayerMusica();

    private String musicaAtual;
    private int volume = 50;

    private PlayerMusica() {}

    public static PlayerMusica getInstance() {
        return instance;
    }
    public String getMusicaAtual() {
        return musicaAtual;
    }

    public void setMusicaAtual(String musicaAtual) {
        this.musicaAtual = musicaAtual;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}