package fr.tetris;
import javax.swing.*;
import java.awt.*;


public class Tetris extends JFrame {

    /**
     * La largeur de la Fenetre.
     */
    public static final int FRAME_WIDTH = 500;

    /**
     * La Longueur de la Fenetre.
     */
    public static final int FRAME_HEIGHT = 500;


    /**
     * Le Constructeur du jeu Tetris
     *
     */
    public Tetris() {


        // JFrame Config (Visible, size, screen positioning)
        this.setTitle("Tetris");
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //this.setResizable(false);


        /**
         * Creation du Board (JPanel) dans le Tetris (JFrame)
         */
        Board Board = new Board();
        this.add(Board);
        Board.setBounds(0,0,600,600);

    }

}
