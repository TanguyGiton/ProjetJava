/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.tetris.piece;

import java.awt.*;

/**
 * La pièce T
 */
public class PieceT extends Piece {

    /**
     * Constructeur de la Pièce T
     */
    public PieceT() {

        super();

        this.setPiece(new boolean[][]{
                {false, true, false},
                {true, true, true}
        });

        this.setColor(new Color(51, 4, 255));
    }
    
}
