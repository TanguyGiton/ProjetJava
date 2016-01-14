package fr.tetris;
import javax.swing.*;


/**
 * The base of the Gui. Composants are inside here.
 * Created by gen on 14/01/16.
 */
public class Tetris extends JFrame {

    static int lin = 600;
    static int col = 600;


    public Tetris() {


        // JFrame Config (Visible, size, screen positioning)
        this.setTitle("Tetris");
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(lin, col);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);



        //Panel Tetris
        Board Board = new Board();
        this.add(Board);
        Board.setBounds(0,0,400,600);


        // Prevenir Tetris que Board sera dans le Content Pane


    }

}
