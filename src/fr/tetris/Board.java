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
     * La matrice qui contient les boutons (pour afficher les cases de notre Tetris).
     */
    public JButton[][] BoardSquares = new JButton[NB_LIN][NB_COL];

    /**
     * Le constructeur de la grille
     * Défini le JPanel et l'affiche
     */
    public Board() {
        this.setLayout(new GridLayout(0, 12));
        //this.setSize(300, 00);
        this.setVisible(true);
        this.setBorder(new LineBorder(Color.BLACK));

        /**
         * Création des contours des carrés
         */
        Insets buttonMargin = new Insets(1, 1, 1, 1);

        /**
         * Création du carré.
         */


        for (int i = 0; i < NB_LIN; i++) {
            for (int j = 0; j < NB_COL; j++) {
                JButton Square = new JButton();
                /**
                 * Mise en place de la Marge
                 */
                Square.setMargin(buttonMargin);

                /**
                 * Créer l'icon du Tetris: les carré qui seront affiché sur Tetris
                 */

                ImageIcon icon = new ImageIcon(
                        new BufferedImage(20, 20, BufferedImage.TYPE_INT_ARGB)
                );
                Square.setIcon(icon);
                Square.setBackground(Color.BLACK);

                BoardSquares[i][j] = Square;
                this.add(BoardSquares[i][j]);

            }
        }

    }

}
