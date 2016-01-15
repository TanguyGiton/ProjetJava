/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.tetris.piece;

import java.awt.*;

/**
 * La pièce L
 */
public class PieceL extends Piece {

    /**
     * Constructeur de la Pièce L
     */
    public PieceL(){

        super();

        this.setPiece(new boolean[][]{
                {false, false, true},
                {true, true, true}
        });

        this.setColor(new Color(255, 246, 4));
    }
}
