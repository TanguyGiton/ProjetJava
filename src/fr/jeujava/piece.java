/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.jeujava;

/**
 *
 * @author gen
 * 
 * @param x La position horizontale de la piece
 * @param y La position Verticale de la piece
 * @param rotateID Savoir s'il l'objet est rotation et si oui laquelle.
 * @param colour quelle couleur de l'objet
 * @param tab la forme de la piece
 */
public class piece { 
    // Règle generale pour toute les pièces.
        
    
        protected int x = 4;  // horizontale
        protected int y = 0;  // verticale
        protected int rotateID = 0; 
        protected String colour; // couleur
        protected int tab[];  // forme de la piece
        protected int nbrCol; //Pour savoir combien de colonne il fait
        protected int nbrlig; //Pour savoir combien de ligne il fait
    
    
    public void randomPiece() {
        
        
    }
}




   
        

