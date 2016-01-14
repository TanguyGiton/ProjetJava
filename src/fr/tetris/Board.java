package fr.tetris;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.Graphics;
import java.awt.image.BufferedImage;


public class Board extends JPanel {
    static int col = 12;
    static int lig = 20;

    public Board() {

        this.setVisible(true);
        this.setSize(lig, col);

        for (int i = 0; i < lig; i++) {
            for (int j = 0; j < col; j++) {

                // :TODO Squares for the Board
                //g.drawRect(col, lig, 20, 20);
            }
        }


    }
}
