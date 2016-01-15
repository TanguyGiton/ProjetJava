package fr.tetris;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;


/**
 * Classe de la barre d'information affichée sur le côté du Tetris pour informer de la prochaine pièce, du score et des commandes.
 */
public class SideBar extends JPanel {


    /**
     * La tabulation utilisé pour les Titres
     */
    private static final int TAB_TITRES = 25;

    /**
     * La tabulation utilisé pour les Textes
     */
     private static final int TAB_TEXT = 10;

    /**
     * Le coordonné Y des Stats
     */
    private static final int COL_STATS = 210;

    /**
     * Le coordonné Y des controles
     */
    private static final int COL_CONTROL = 420;


    /**
     * Le nombre de pixel entre chaque entrée de ligne
     */
    private static final int ENTRE_LIN = 25;

    /**
     * Le style d'écriture de format petit
     */
    private static final Font SMALL_FONT = new Font("Ubuntu", Font.PLAIN, 11);

    /**
     * Le style d'écriture de format grand
     */
    private static final Font LARGE_FONT = new Font("Ubuntu", Font.BOLD, 13);

    /**
     * La Couleur du texte
     */
    private static final Color DRAW_COLOR = new Color(128, 192, 128);


    /**
     * Le constructeur de la barre d'information.
     */
    public SideBar() {
        this.setBackground(Color.blue);
        //this.add(new JButton("SideBar")); Fais buguer le key listener
        this.setVisible(true);
    }

        //@Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Mettre la couleur
            g.setColor(DRAW_COLOR);

		/*
		 * Une variable utilisé pour stocker les coordonnée temporairement.
		 * On pourra ré-ordonner, bouger et/ou ajouter/supprimer si besoin
	    */
            int Coor_Temp;


		/*
		 * Dessine la partie Stat
		 */
            g.setFont(LARGE_FONT);
            g.drawString("Stats", TAB_TITRES, Coor_Temp = COL_STATS);
            g.setFont(SMALL_FONT);
            // :TODO getScore() et l'écrire dans SideBar
           // g.drawString("Level: " + Tetris.getLevel(), TAB_TEXT, Coor_Temp += ENTRE_LIN);
           // g.drawString("Score: " + Tetris.getScore(), TAB_TEXT, Coor_Temp += ENTRE_LIN);

		/*
		 * Dessine la partie controle
		 */
            g.setFont(LARGE_FONT);
            g.drawString("Controls", TAB_TITRES, Coor_Temp = COL_CONTROL);
            g.setFont(SMALL_FONT);
            g.drawString("Q/LEFT - Left", TAB_TEXT, Coor_Temp += ENTRE_LIN);
            g.drawString("D/RIGHT - Right", TAB_TEXT, Coor_Temp += ENTRE_LIN);
            g.drawString("Z/UP - Rotate", TAB_TEXT, Coor_Temp += ENTRE_LIN);
            g.drawString("S/DOWN - Drop", TAB_TEXT, Coor_Temp += ENTRE_LIN);
            g.drawString("P - Pause Game", TAB_TEXT, Coor_Temp += ENTRE_LIN);

    }

}
