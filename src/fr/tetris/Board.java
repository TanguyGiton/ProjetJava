package fr.tetris;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Board {

    private final JPanel gui = new JPanel(new BorderLayout(1, 1));
    private JButton[][] boardSquares = new JButton[12][20]; // Les Carré
    private JPanel board; //

    Board() {
        initializeGui();
    }

    public final void initializeGui() {

        board = new JPanel(new GridLayout(0, 12));
        board.setBorder(new LineBorder(Color.BLACK));
        gui.add(board);

        // create the Board squares
        Insets buttonMargin = new Insets(1,1,1,1);
        for (int ii = 0; ii < 12; ii++) {
            for (int jj = 0; jj < 20; jj++) {
                JButton b = new JButton();
                b.setMargin(buttonMargin);
                ImageIcon icon = new ImageIcon(

                        new BufferedImage(20, 20, BufferedImage.TYPE_INT_ARGB)); // Taille des Pièces
                b.setIcon(icon);
                b.setBackground(Color.BLACK);
                boardSquares[ii][jj] = b;
            }
        }

        // fill squares
        for (int ii = 0; ii < 12; ii++) {
            for (int jj = 0; jj < 20; jj++) {

                board.add(boardSquares[ii][jj]);
            }
        }
    }

/*
    public final JComponent getboard() {
        return Board;
    }
*/
    public final JComponent getGui() {
        return gui;
    }
}