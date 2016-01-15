/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.tetris.piece;

import java.awt.*;

/**
 * La pièce J
 */
public class PieceJ extends Piece {

    /**
     * Constructeur de la pièce J
     */
    public PieceJ() {

        super();

        this.setPiece(new boolean[][]{
                {true, false, false},
                {true, true, true}
        });

        this.setColor(new Color(255, 122, 4));

    }
}
