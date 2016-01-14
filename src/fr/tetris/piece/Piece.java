package fr.tetris.piece;

/**
 * Classe abstraite de laquelle toutes les pièces héritent.
 */
public abstract class Piece {

    /**
     * La ligne sur laquelle la pièce est positionnée
     */
    protected int lin;

    /**
     * La colonne sur laquelle la pièce est positionnée
     */
    protected int col;

    /**
     * La matrice représentant la pièce
     */
    protected boolean[][] piece;

    /**
     * Constructeur d'une pièce
     */
    public Piece() {
        this.lin = 0;
        this.col = 0;
    }

    /**
     * Fait une rotation sur la pièce
     */
    public void rotate() {
        // TODO: Faire la méthode rotate
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
}




   
        

