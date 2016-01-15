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
     * La matrice qui contient les carreaux
     */
    public Piece[][] boardPieces = new Piece[NB_LIN][NB_COL];

    /**
     * Le constructeur de la grille
     * Défini le JPanel et l'affiche
     */
    public Board() {
        this.setLayout(new GridLayout(NB_LIN, NB_COL));
        this.setBorder(new LineBorder(DEFAULT_COLOR));
        this.setBackground(DEFAULT_COLOR);

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
     * Afficher le board
     *
     * @param currentPiece La pièce courante
     */
    public void print(Piece currentPiece) {

        this.reinit();

        int lin, col;

        /**
         * Affichage des carreaux
         */
        for (lin = 0; lin < NB_LIN; lin++) {
            for (col = 0; col < NB_COL; col++) {
                if (null != boardPieces[lin][col]) {
                    boardSquares[lin][col].setBackground(boardPieces[lin][col].getColor());
                }
            }
        }

        /**
         * Affichage de l'ombre de la pièce courante
         */

        int memLin = currentPiece.getLin();
        int memCol = currentPiece.getCol();

        while (!verifCollision(currentPiece)) {
            currentPiece.moveDown();
        }
        currentPiece.cancelMoveDown();

        for (lin = currentPiece.getLin(); lin < currentPiece.getLin() + currentPiece.getNbLin(); lin++) {
            for (col = currentPiece.getCol(); col < currentPiece.getCol() + currentPiece.getNbCol(); col++) {
                if (currentPiece.isASquare(lin, col)) {
                    boardSquares[lin][col].setBackground(new Color(currentPiece.getColor().getRed(), currentPiece.getColor().getGreen(), currentPiece.getColor().getBlue(), 70));
                }
            }
        }

        currentPiece.setPosition(memLin, memCol);

        /**
         * Affichage de la pièce courante
         */
        for (lin = currentPiece.getLin(); lin < currentPiece.getLin() + currentPiece.getNbLin(); lin++) {
            for (col = currentPiece.getCol(); col < currentPiece.getCol() + currentPiece.getNbCol(); col++) {
                if (currentPiece.isASquare(lin, col)) {
                    boardSquares[lin][col].setBackground(currentPiece.getColor());
                }
            }
        }

    }

    /**
     * Affichage du mode pause
     *
     * @param gameover Vaut vrai si c'est Game Over
     */
    public void printPause(boolean gameover) {
        reinit();

        for (int i = 0; i < 4; i++) {
            boardSquares[3 + i][3].setBackground(Color.white);
            boardSquares[3 + i][4].setBackground(Color.white);
            boardSquares[3 + i][7].setBackground(Color.white);
            boardSquares[3 + i][8].setBackground(Color.white);
        }

        if (gameover) {
            boardSquares[11][2].setBackground(Color.white);
            boardSquares[10][2].setBackground(Color.white);
            boardSquares[10][3].setBackground(Color.white);
            boardSquares[9][3].setBackground(Color.white);
            boardSquares[8][4].setBackground(Color.white);
            boardSquares[9][4].setBackground(Color.white);
            boardSquares[8][5].setBackground(Color.white);
            boardSquares[9][5].setBackground(Color.white);
            boardSquares[8][6].setBackground(Color.white);
            boardSquares[9][6].setBackground(Color.white);
            boardSquares[8][7].setBackground(Color.white);
            boardSquares[9][7].setBackground(Color.white);
            boardSquares[9][8].setBackground(Color.white);
            boardSquares[10][8].setBackground(Color.white);
            boardSquares[10][9].setBackground(Color.white);
            boardSquares[11][9].setBackground(Color.white);
        }
    }

    /**
     * Vérifier que la piece peut être déplacer à ces coordonnées
     *
     * @param piece la pièce à vérifier
     * @return Vrai si il y a collision, Faux sinon
     */
    public boolean verifCollision(Piece piece) {
        if (piece.getLin() < 0 || piece.getCol() < 0 || piece.getLin() + piece.getNbLin() > NB_LIN || piece.getCol() + piece.getNbCol() > NB_COL) {
            return true;
        }
        for (int lin = piece.getLin(); lin < piece.getLin() + piece.getNbLin(); lin++) {
            for (int col = piece.getCol(); col < piece.getCol() + piece.getNbCol(); col++) {
                if (piece.isASquare(lin, col) && null != boardPieces[lin][col]) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Ajouter une pièce dans le board
     *
     * @param piece la pièce à ajouter
     */
    public void addPiece(Piece piece) {
        for (int lin = piece.getLin(); lin < piece.getLin() + piece.getNbLin(); lin++) {
            for (int col = piece.getCol(); col < piece.getCol() + piece.getNbCol(); col++) {
                if (piece.isASquare(lin, col)) {
                    boardPieces[lin][col] = piece;
                }
            }
        }
    }

    /**
     * Détecter les lignes pleines
     *
     * @return Retourne le nombre de ligne supprimé
     */
    public int fullLines() {
        boolean flag;
        int col;
        int nbDeleteLin = 0;
        for (int lin = 0; lin < NB_LIN; lin++) {
            flag = true;
            col = 0;
            while (flag && col < NB_COL) {
                if (null == boardPieces[lin][col]) {
                    flag = false;
                }
                col++;
            }

            if (flag) {
                supprLine(lin);
                nbDeleteLin++;
            }
        }
        return nbDeleteLin;
    }

    /**
     * Supprimer une ligne
     *
     * @param lin la ligne à supprimer
     */
    public void supprLine(int lin) {
        for (int l = lin; l > 0; l--) {
            for (int c = 0; c < NB_COL; c++) {
                boardPieces[l][c] = boardPieces[l - 1][c];
            }
        }
    }

    /**
     * Reset le board
     */
    public void reset() {
        for (int lin = 0; lin < NB_LIN; lin++) {
            for (int col = 0; col < NB_COL; col++) {
                boardPieces[lin][col] = null;
            }
        }
    }
}
