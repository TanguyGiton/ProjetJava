package fr.tetris;

import java.applet.*;
import java.net.*;

/**
 * La classe principale utilisée pour lancer le Tetris
 */
public class Main {

    /**
     * La méthode qui est lancée en première
     */
    public static void main(String[] args) {

        Audio Audio = new Audio();



        Audio.jouerEnBoucle();
        Tetris tetris = new Tetris();




    } 
}
