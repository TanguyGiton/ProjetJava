/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.tetris.piece;

/**
 *
 * @author gen
 */
public class PieceI extends Piece {
    
    public PieceI() {

        x = 5;
    
        
        int tab[][] = {
            {
                0,  0,  0,  0,
                1,  1,  1,  1,
                0,  0,  0,  0,
                0,  0,  0,  0,
            },
            {
                0,  0,  1,  0,
                0,  0,  1,  0,
                0,  0,  1,  0,
                0,  0,  1,  0,
            },
            {
                0,  0,  0,  0,
                0,  0,  0,  0,
                1,  1,  1,  1,
                0,  0,  0,  0,
            },
            {
                0,  1,  0,  0,
                0,  1,  0,  0,
                0,  1,  0,  0,
                0,  1,  0,  0,
            }
        };
    
    }
}