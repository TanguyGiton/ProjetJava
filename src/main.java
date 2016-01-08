/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import gui.board;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

/**
 *
 * @author gen
 */
public class main {
    
    /**
     *
     */
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Tetris - ESIEA");
        board game = new board();
        frame.add(game);
        frame.setSize(400, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (true) {
            game.moveBall();
            game.repaint();
            Thread.sleep(10);  
            
            if (board.x > 400) {
                System.out.println("test 1 complete.");
            }
        }
    }
}
