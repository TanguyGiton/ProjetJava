/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.tetris.piece;

/**
 * La pièce S
 */
public class PieceS extends Piece {

    /**
     * Constructeur de la Pièce S
     */
    public PieceS() {

        super();

        this.setPiece(new boolean[][]{
                {false, true, true},
                {true, true, false}
        });
    } 
}
