package fr.tetris;

import javax.swing.*;
import java.awt.*;

/**
 * Classe de la barre d'information affichée sur le côté du Tetris pour informer de la prochaine pièce, du score et des commandes.
 */
public class SideBoard extends JPanel {

    /**
     * Le constructeur de la barre d'information.
     */
    public SideBoard(){
        this.setBackground(Color.blue);
        this.add(new JButton("SideBoard"));
        this.setVisible(true);
    }

}
