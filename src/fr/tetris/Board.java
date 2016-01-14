package fr.tetris;
import javax.swing.*;


public class Board extends JPanel {

    /**
     * Le nombre de colonnes de la grille
     */
    public static final int NB_COL = 12;

    /**
     * Le nombre de lignes de la grille
     */
    public static final int NB_LIN = 20;


    /**
     * Le constructeur de la grille
     * <p>
     * Défini le JPanel et l'affiche
     */
    public Board() {

        this.setSize(NB_LIN, NB_COL);
        this.setVisible(true);

        for (int i = 0; i < NB_LIN; i++) {
            for (int j = 0; j < NB_COL; j++) {

                // :TODO Squares for the Board
                //g.drawRect(NB_COL, NB_LIN, 20, 20);
            }
        }

    }
}
