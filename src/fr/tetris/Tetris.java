package fr.tetris;

import javax.swing.*;
import java.awt.*;


public class Tetris extends JFrame {

    /**
     * La largeur de la Fenetre.
     */
    public static final int FRAME_WIDTH = 800;

    /**
     * La Longueur de la Fenetre.
     */
    public static final int FRAME_HEIGHT = 800;


    /**
     * Le Constructeur du jeu Tetris
     *
     */
    public Tetris() {


        // JFrame Config (Visible, size, screen positioning)
        this.setTitle("Tetris");
        this.setLayout(new BorderLayout());


        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        /**
         * Creation du Board (JPanel) dans le Tetris (JFrame)
         */
        Board board = new Board();
        this.getContentPane().add(board, BorderLayout.CENTER);

        /**
         * Creation du SideBoard (JPanel) dans le Tetris (JFrame)
         */
        this.getContentPane().add(new JButton("SideBoard"), BorderLayout.EAST);
        // TODO: Ajouter vraiment le SideBoard

        /**
         * On affiche le Tetris
         */

        this.setVisible(true);

    }

}
