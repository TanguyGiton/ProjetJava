/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.tetris.piece;

/**
 * La pièce Z
 */
public class PieceZ extends Piece {

    /**
     * Constructeur de la Pièce Z
     */
    public PieceZ() {

        super();

        this.piece = new boolean[][]{
                {true, true, false},
                {false, true, true}
        };
    } 
}
