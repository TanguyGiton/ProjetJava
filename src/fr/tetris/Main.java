package fr.tetris;

import javax.swing.*;

/**
 *
 * @author gen
 */
public class Main {

    public static void main(String[] args) {
        Board board = new Board();

        JFrame f = new JFrame("Tetris");
        f.add(board.getGui());
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setLocationByPlatform(true);

        // ensures the frame is the minimum size it needs to be
        // in order display the components within it
        f.pack();

        // ensures the minimum size is enforced.
        f.setMinimumSize(f.getSize());
        f.setVisible(true);
    } 
}
