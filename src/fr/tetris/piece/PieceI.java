package fr.tetris.piece;

import java.awt.*;

/**
 *  La piece I
 */
public class PieceI extends Piece {

    /**
     * Constructeur de la pièce I
     */
    public PieceI() {

        super();

        this.setPiece(new boolean[][]{
                {true, true, true, true}
        });

        this.setColor(new Color(255, 4, 4));
    
    }
}