package fr.tetris;

import fr.tetris.piece.Piece;

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
     * La couleur par défaut des carreaux
     */
    public static final Color DEFAULT_COLOR = Color.black;

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
        this.setBorder(new LineBorder(DEFAULT_COLOR));

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

    public void reinit() {
        for (int lin = 0; lin < NB_LIN; lin++) {
            for (int col = 0; col < NB_COL; col++) {
                boardSquares[lin][col].setBackground(DEFAULT_COLOR);
            }
        }
    }

    /**
     * Affiche le board
     *
     * @param currentPiece La pièce courante
     */
    public void print(Piece currentPiece) {

        this.reinit();

        for (int lin = currentPiece.getLin(); lin < currentPiece.getNbLin(); lin++) {
            for (int col = currentPiece.getCol(); col < currentPiece.getNbCol(); col++) {
                if (currentPiece.isASquare(lin, col)) {
                    boardSquares[lin][col].setBackground(currentPiece.getColor());
                }
            }
        }
    }

}
