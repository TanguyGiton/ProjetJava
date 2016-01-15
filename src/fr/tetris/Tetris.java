package fr.tetris;

import fr.tetris.piece.Piece;

import javax.swing.*;
import java.awt.*;


public class Tetris extends JFrame {

    /**
     * Le JPanel Board
     */
    private Board board;

    /**
     * Le Jpanel SideBoard
     */
    private SideBoard sideBoard;

    /**
     * La pièce en cours
     */
    private Piece currentPiece;

    /**
     * Le Constructeur du jeu Tetris
     *
     */
    public Tetris() {


        // JFrame Config (Visible, size, screen positioning)
        this.setTitle("Tetris");
        this.setLayout(new BorderLayout());

        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        /**
         * Creation du Board (JPanel) dans le Tetris (JFrame)
         */
        this.board = new Board();
        this.getContentPane().add(this.board, BorderLayout.CENTER);

        /**
         * Creation du SideBoard (JPanel) dans le Tetris (JFrame)
         */
        this.getContentPane().add(new JButton("SideBoard"), BorderLayout.EAST);
        // TODO: Ajouter vraiment le SideBoard

        /**
         * On affiche le Tetris
         */

        this.pack();
        this.setVisible(true);

    }

}
