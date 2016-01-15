package fr.tetris;

import fr.tetris.piece.Piece;

import javax.swing.*;
import java.awt.*;


public class Tetris extends JFrame {

    /**
     * Le JPanel board
     */
    private Board board;

    /**
     * Le Jpanel SideBar
     */
    private SideBar sideBar;

    /**
     * La pièce en cours
     */
    private Piece currentPiece;

    /**
     * Le Constructeur du jeu Tetris
     *
     * On affiche la fenêtre du Tetris
     */
    public Tetris() {

        /**
         * Paramétrer la fenêtre du Tetris
         */
        this.setTitle("Tetris");
        this.getContentPane().setBackground( Color.BLACK);
        this.setLayout(new BorderLayout());

        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        /**
         * Création et implémentation du Board (JPanel) dans le Tetris (JFrame)
         */
        this.board = new Board();
        this.getContentPane().add(this.board, BorderLayout.CENTER);

        /**
         * Création et implémentation du SideBar (JPanel) dans le Tetris (JFrame)
         */
        this.sideBar = new SideBar();
        this.getContentPane().add(this.sideBar, BorderLayout.EAST);


        /**
         * Afficher le Tetris
         */
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        /**
         * Lancer
         */

        this.run();
    }

    private void run() {
        // TODO: Lancer le jeu
    }

}
