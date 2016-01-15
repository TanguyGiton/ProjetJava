package fr.tetris;

import fr.tetris.piece.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;


public class Tetris extends JFrame {

    /**
     * Le JPanel board
     */
    private Board board;

    /**
     * Le Jpanel SideBar
     */
    private SideBar sideBar;

    /**
     * La pièce en cours
     */
    private Piece currentPiece;

    /**
     * Le Constructeur du jeu Tetris
     *
     * On affiche la fenêtre du Tetris
     */
    public Tetris() {

        /**
         * Paramétrer la fenêtre du Tetris
         */
        this.setTitle("Tetris");
        this.getContentPane().setBackground( Color.BLACK);
        this.setLayout(new BorderLayout());

        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        /**
         * Création et implémentation du Board (JPanel) dans le Tetris (JFrame)
         */
        this.board = new Board();
        this.add(this.board, BorderLayout.CENTER);

        /**
         * Création et implémentation du SideBar (JPanel) dans le Tetris (JFrame)
         */
        this.sideBar = new SideBar();
        this.add(this.sideBar, BorderLayout.EAST);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    /**
                     * Flèche du haut ou Z : faire tourner la pièce
                     */
                    case KeyEvent.VK_Z:
                    case KeyEvent.VK_UP:
                        currentPiece.rotate();
                        updatePrint();
                        break;

                    /**
                     * Flèche de gauche ou Q: déplacement à gauche
                     */
                    case KeyEvent.VK_Q:
                    case KeyEvent.VK_LEFT:
                        currentPiece.moveLeft();
                        updatePrint();
                        break;

                    /**
                     * Flèche de droite ou D: déplacement à droite
                     */
                    case KeyEvent.VK_D:
                    case KeyEvent.VK_RIGHT:
                        currentPiece.moveRight();
                        updatePrint();
                        break;

                }
            }
        });


        /**
         * Afficher le Tetris
         */
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        /**
         * Lancer
         */

        this.run();
    }

    /**
     * Lancer le jeu
     */
    private void run() {
        this.currentPiece = randomPiece();
        this.updatePrint();

    }

    /**
     * Donne une pièce aléatoire
     *
     * @return une pièce
     */
    private Piece randomPiece() {
        Random random = new Random();

        switch (random.nextInt(7)) {
            case 0:
                return new PieceI();
            case 1:
                return new PieceJ();
            case 2:
                return new PieceL();
            case 3:
                return new PieceO();
            case 4:
                return new PieceS();
            case 5:
                return new PieceT();
            case 6:
                return new PieceZ();
        }

        return null;
    }

    /**
     * Mise à jour de l'affichage
     */
    private void updatePrint() {
        this.board.print(this.currentPiece);
        this.board.repaint();
    }
}
