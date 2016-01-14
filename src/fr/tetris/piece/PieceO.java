/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.tetris.piece;

/**
 * La pièce O
 */
public class PieceO extends Piece {

    /**
     * Le constructeur la Pièce O
     */
    public PieceO() {

        super();

        this.piece = new boolean[][]{
                {true, true},
                {true, true}
        };
    
    }
}
