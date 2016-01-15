package fr.tetris;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * La classe principale utilisée pour lancer le Tetris
 */
public class Main {

    /**
     * La méthode qui est lancée en première
     */
    public static void main(String[] args) {

        Tetris tetris = new Tetris();

        AudioClip snd;
        try {
            snd = Applet.newAudioClip(
                    new URL("file: piece/tetris.wav"));
            //snd.play();
            snd.loop();
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    } 
}
