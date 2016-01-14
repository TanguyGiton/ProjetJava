/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.tetris.piece;

/**
 * La pièce L
 */
public class PieceL extends Piece {

    /**
     * Constructeur de la Pièce L
     */
    public PieceL(){

        super();

        this.piece = new boolean[][]{
                {false, false, false, true},
                {true, true, true, true}
        };
    }
}
