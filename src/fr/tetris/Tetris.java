package fr.tetris;
import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;


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
        this.setLayout(null);


        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        /**
         * Creation du Board (JPanel) dans le Tetris (JFrame)
         */
        Board Board = new Board();
        this.getContentPane().add(Board);
        Board.setBounds(0,0,400,600);

        this.setVisible(true);

    }

}
