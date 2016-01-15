package fr.tetris;

import fr.tetris.piece.Piece;

import javax.swing.*;
import java.awt.*;


/**
 * Classe de la barre d'information affichée sur le côté du Tetris pour informer de la prochaine pièce, du score et des commandes.
 */
public class SideBar extends JPanel {


    /**
     * La largeur de la SideBar
     */
    private static final int WIDTH_PANEL = 150;

    /**
     * La position en X des titres
     */
    private static final int LEFT_TITLES = WIDTH_PANEL / 2;

    /**
     * La position en X des textes
     */
    private static final int LEFT_TEXT = WIDTH_PANEL / 2;

    /**
     * La position en X de l'affichage de la pièce suivante
     */
    private static final int LEFT_NEXT_PIECE = WIDTH_PANEL / 2;

    /**
     * La position en Y du score
     */
    private static final int TOP_SCORE = 210;

    /**
     * La position en Y des contrôles
     */
    private static final int TOP_CONTROLS = 420;

    /**
     * La position en Y de la pièce suivante
     */
    private static final int TOP_NEXT = 50;


    /**
     * Le nombre de pixel entre chaque ligne
     */
    private static final int INTER_LIN = 25;

    /**
     * La police de texte
     */
    private static final Font TEXT_FONT = new Font("Arial", Font.PLAIN, 11);

    /**
     * La police des titres
     */
    private static final Font TITLES_FONT = new Font("Arial", Font.BOLD, 13);

    /**
     * La Couleur du texte
     */
    private static final Color FONT_COLOR = new Color(223, 221, 214);

    /**
     * Le Tetris
     */
    private Tetris tetris;

    /**
     * Le constructeur de la barre d'information.
     */
    public SideBar(Tetris tetris) {
        this.tetris = tetris;

        this.setBackground(Color.black);
        setPreferredSize(new Dimension(150, (Board.COTE_CARREAU + 2 * Board.MARGE_CARREAU) * Board.NB_LIN));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(FONT_COLOR);

        int cursorTop;

        /**
         * Dessine la partie Score
         */
        g.setFont(TITLES_FONT);
        g.drawString("SCORE", LEFT_TITLES - 20, cursorTop = TOP_SCORE);
        g.setFont(TEXT_FONT);
        g.drawString(tetris.getScore() + " points", LEFT_TEXT - 20, cursorTop += INTER_LIN);


        /**
         * Dessine la partie controles
         */

        g.setFont(TITLES_FONT);
        g.drawString("CONTROLS", LEFT_TITLES - 35, cursorTop = TOP_CONTROLS);
        g.setFont(TEXT_FONT);
        g.drawString("Q or LEFT - Left", LEFT_TEXT - 40, cursorTop += INTER_LIN);
        g.drawString("D or RIGHT - Right", LEFT_TEXT - 40, cursorTop += INTER_LIN);
        g.drawString("Z or UP - Rotate", LEFT_TEXT - 40, cursorTop += INTER_LIN);
        g.drawString("S or DOWN - Drop", LEFT_TEXT - 40, cursorTop += INTER_LIN);
        g.drawString("P - Play or Pause", LEFT_TEXT - 40, cursorTop += INTER_LIN);


        /**
         * Dessine l'emplacement de la pièce suivante
         */

        if (tetris.isGameOver()) {
            g.setFont(TITLES_FONT);
            g.drawString("GAME OVER", 35, cursorTop = TOP_NEXT-10);
            g.drawString("PRESS ENTER", 32, cursorTop += INTER_LIN * 3);
            g.drawString("TO CONTINUE", 32, cursorTop += INTER_LIN);


        } else {
            g.setFont(TITLES_FONT);
            g.drawString("NEXT", LEFT_TITLES - 18, TOP_NEXT);

            Piece next = tetris.getNextPiece();

            for (int lin = 0; lin < next.getNbLin(); lin++) {
                for (int col = 0; col < next.getNbCol(); col++) {
                    if (next.isASquare(lin + next.getLin(), col + next.getCol())) {
                        g.setColor(next.getColor());
                        g.fillRect(col * Board.COTE_CARREAU + (LEFT_NEXT_PIECE - (next.getNbCol() * Board.COTE_CARREAU / 2)), lin * Board.COTE_CARREAU + TOP_NEXT + 20, Board.COTE_CARREAU, Board.COTE_CARREAU);
                    }
                }
            }
        }

    }

}
