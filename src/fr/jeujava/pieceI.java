/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.jeujava;

/**
 *
 * @author gen
 */
public class pieceI extends piece {
    
    public pieceI() {

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