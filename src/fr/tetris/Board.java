package fr.tetris;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.image.BufferedImage;


public class Board extends JPanel {

    /**
     * Le nombre de lignes de la matrice.
     */
    public static final int NB_LIN = 20;

    /**
     * Le nombre de colonnes de la matrice.
     */
    public static final int NB_COL = 12;

    /**
     * La taille en pixel du côté d'un carreau
     */
    public static final int COTE_CARREAU = 20;

    /**
     * La marge des carreaux
     */
    public static final int MARGE_CARREAU = 1;

    /**
     * La matrice qui contient les boutons (pour afficher les cases de notre Tetris).
     */
    public JButton[][] boardSquares = new JButton[NB_LIN][NB_COL];

    /**
     * Le constructeur de la grille
     * Défini le JPanel et l'affiche
     */
    public Board() {
        this.setLayout(new GridLayout(NB_LIN, NB_COL));
        this.setBorder(new LineBorder(Color.BLACK));

        /**
         * Ajouter les marges autour des carreaux
         */
        Insets buttonMargin = new Insets(MARGE_CARREAU, MARGE_CARREAU, MARGE_CARREAU, MARGE_CARREAU);

        /**
         * Créer l'icone des carreaux qui seront affichés sur Tetris
         */
        ImageIcon icon = new ImageIcon(
                new BufferedImage(COTE_CARREAU, COTE_CARREAU, BufferedImage.TYPE_INT_ARGB)
        );

        /**
         * Créer les carreaux
         */
        for (int i = 0; i < NB_LIN; i++) {
            for (int j = 0; j < NB_COL; j++) {
                JButton square = new JButton();
                square.setEnabled(false);

                square.setMargin(buttonMargin);

                square.setMargin(buttonMargin);
                square.setIcon(icon);
                square.setBackground(Color.BLACK);

                boardSquares[i][j] = square;
                this.add(boardSquares[i][j]);
            }
        }

        /**
         * Afficher
         */
        this.setVisible(true);

    }

}
