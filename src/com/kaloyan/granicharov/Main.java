package com.kaloyan.granicharov;

import com.kaloyan.granicharov.audio.AudioPlayer;
import com.kaloyan.granicharov.screen.ClientScreen;

public class Main {

    public static void main(String[] args) {

        ClientScreen clientScreen = new ClientScreen();
        clientScreen.setVisible(true);

        AudioPlayer player = new AudioPlayer();
        player.play();
    }
}
