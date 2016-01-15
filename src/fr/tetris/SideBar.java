package fr.tetris;

import javax.swing.*;
import java.awt.*;

/**
 * Classe de la barre d'information affichée sur le côté du Tetris pour informer de la prochaine pièce, du score et des commandes.
 */
public class SideBar extends JPanel {

    /**
     * Le constructeur de la barre d'information.
     */
    public SideBar() {
        this.setBackground(Color.blue);
        //this.add(new JButton("SideBar")); Fais buguer le key listener
        this.setVisible(true);
    }

}
