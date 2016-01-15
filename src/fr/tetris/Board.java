package fr.tetris;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.Graphics;
import java.awt.image.BufferedImage;


public class Board extends JPanel {

    /**
     * Le nombre de lignes de la Matrice.
     */
    public static final int NB_LIN = 20;

    /**
     * Le nombre de colonnes de la Matrice.
     */
    public static final int NB_COL = 12;

    /**
     * La Matrice qui contient les Boutons.
     */
    public JButton[][] BoardSquares = new JButton[20][12];

    /**
     * Le constructeur de la grille
     * <p>
     * Défini le JPanel et l'affiche
     */
    public Board() {

        this.setSize(NB_LIN, NB_COL);
        this.setVisible(true);
        this.setBorder(new LineBorder(Color.BLACK));

        /**
         * Création des contours des carrés
         */
        Insets buttonMargin = new Insets(1,1,1,1);

        /**
         * Création du carré.
         */
        JButton Square = new JButton();

        for (int i = 0; i < NB_LIN; i++) {
            for (int j = 0; j < NB_COL; j++) {

                /**
                 * Mise en place de la Marge
                 */
                Square.setMargin(buttonMargin);

                /**
                 * Créer l'icon du Tetris: les carré qui seront affiché sur Tetris
                 */
                ImageIcon icon = new ImageIcon(
                        new BufferedImage(25, 25, BufferedImage.TYPE_INT_ARGB) );
                Square.setIcon(icon);
                Square.setBackground(Color.BLACK);

                BoardSquares[i][j] = Square;
                System.out.println(BoardSquares[i][j]);
                this.add(BoardSquares[i][j]);
                //System.out.println("                      Line Nbr #"+j);
            }
            //System.out.println("Colonne Nbr #"+i);
        }

    }

}
