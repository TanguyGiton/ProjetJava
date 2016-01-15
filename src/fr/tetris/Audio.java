package fr.tetris;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;


public class Audio extends Thread
{
    private URL url;
    private AudioClip sound;

    /**
     *
     * Constructeur pour la classe Audio
     */
    public Audio()
    {
        url = this.getClass().getClassLoader().getResource("fr/tetris/tetris.wav");
        sound = Applet.newAudioClip(url);
    }

    /**
     * Fonction pour jouer 1x la musique.
     */
    public void jouer()
    {
        sound.play();
    }

    /**
     * Fonction pour jouer en boucle la musique
     */
    public void jouerEnBoucle()
    {
        sound.loop();
    }

    /**
     * Fonction pour Arreter la musique
     */
    public void arreter()
    {
        sound.stop();
    }
}