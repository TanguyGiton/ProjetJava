package fr.tetris.piece;

import fr.tetris.Tetris;

import java.awt.*;

/**
 * Classe abstraite de laquelle toutes les pièces héritent.
 */
public abstract class Piece {

    protected Tetris tetris;

    /**
     * La ligne sur laquelle la pièce est positionnée
     */
    protected int lin;

    /**
     * La colonne sur laquelle la pièce est positionnée
     */
    protected int col;

    /**
     * Le nombre de ligne que fait la pièce
     */
    protected int nbLin;

    /**
     * Le nombre de colonne que fait la pièce
     */
    protected int nbCol;
    /**
     * La couleur de la pièce
     */
    protected Color color;
    /**
     * La matrice représentant la pièce
     */
    private boolean[][] piece;

    /**
     * Constructeur d'une pièce
     */
    public Piece() {
        this.lin = 0;
        this.col = 4;
    }

    /**
     * Initialise la matrice de la pièce
     *
     * @param piece la matrice de la piece
     */
    protected void setPiece(boolean[][] piece) {
        this.piece = piece;

        this.nbLin = this.piece.length;
        this.nbCol = this.piece[0].length;
    }


    /**
     * Affiche la piece dans la console
     */
    public void printConsole() {
        int lin, col;

        for (lin = 0; lin < this.nbLin; lin++) {
            for (col = 0; col < this.nbCol; col++) {
                System.out.print(this.piece[lin][col]);
                System.out.print(' ');
            }
            System.out.println();
        }

        System.out.println();
    }

    /**
     * Fait une rotation sur la pièce
     */
    public void rotate() {
        int lin, col;

        boolean temp[][] = new boolean[nbCol][nbLin];

        for (lin = 0; lin < this.nbLin; lin++) {
            for (col = 0; col < this.nbCol; col++) {
                temp[col][(nbLin - 1) - lin] = this.piece[lin][col];
            }
        }

        this.setPiece(temp);

        if (this.col + this.nbCol > fr.tetris.Board.NB_COL) {
            this.col = fr.tetris.Board.NB_COL - this.nbCol;
        }
    }

    /**
     * Vérifie si aux coordonnées du board, il y a un carreau
     *
     * @param lin la ligne du board à vérifier
     * @param col la colonne du board à vérifier
     * @return Vrai si il y a un carreau, Faux sinon
     */
    public boolean isASquare(int lin, int col) {
        return lin >= this.lin && col >= this.col && this.piece[lin - this.lin][col - this.col];
    }

    /**
     * Déplacer la pièce à gauche
     */
    public void moveRight() {
        this.col++;
    }

    /**
     * Déplacer la pièce à droite
     */
    public void moveLeft() {
        this.col--;
    }

    /**
     * Déplacer la pièce vers le bas
     */
    public void moveDown() {
        this.lin++;
    }

    /**
     * Annuler le déplacement vers le bas, utilisé suite à une collision
     */
    public void cancelMoveDown() {
        this.lin--;
    }

    /**
     * La colonne sur laquelle la piece est positionnée
     *
     * @return La colonne
     */
    public int getCol() {
        return col;
    }

    /**
     * La ligne sur laquelle la pièce est positionnée
     *
     * @return La ligne
     */
    public int getLin() {
        return lin;
    }

    /**
     * Nombre de lignes de la pièce (largeur de la pièce)
     * @return le nombre de lignes
     */
    public int getNbLin() {
        return nbLin;
    }

    /**
     * Nombre de colonnes de la pièce
     * @return le nombre de colonnes
     */
    public int getNbCol() {
        return nbCol;
    }

    /**
     * Définir la position de la pièce
     *
     * @param lin la ligne
     * @param col la colonne
     */
    public void setPosition(int lin, int col) {
        this.lin = lin;
        this.col = col;
    }

    /**
     * Retourner l'objet Color de la pièce représentant sa couleur
     *
     * @return l'objet Color de la pièce
     */
    public Color getColor() {
        return color;
    }

    /**
     * Définir la couleur de la pièce avec un objet Color
     *
     * @param color un objet Color représentant la couleur de la pièce
     */
    public void setColor(Color color) {
        this.color = color;
    }
}




   
        

