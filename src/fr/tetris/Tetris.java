package fr.tetris;
import javax.swing.*;



public class Tetris extends JFrame {

    public static int FRAME_WIDTH = 600;
    public static int FRAME_HEIGHT = 600;


    public Tetris() {


        // JFrame Config (Visible, size, screen positioning)
        this.setTitle("Tetris");
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);



        //Panel Tetris
        Board Board = new Board();
        this.add(Board);
        Board.setBounds(0,0,400,600);


        // Prevenir Tetris que Board sera dans le Content Pane


    }

}
