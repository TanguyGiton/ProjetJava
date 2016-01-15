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
     * La pièce suivant
     */
    private Piece nextPiece;

    /**
     * La vitesse du jeu
     */
    private int speed;

    /**
     * Indiquer si le jeu est fini
     */
    private boolean gameOver;

    /**
     * Indiquer si le jeu est en pause
     */
    private boolean pause;

    /**
     * Le score
     */
    private int score;

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
        this.sideBar = new SideBar(this);
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
                        if (!isPause()) {
                            currentPiece.rotate();
                            if (board.verifCollision(currentPiece)) {
                                currentPiece.rotate();
                                currentPiece.rotate();
                                currentPiece.rotate();
                            } else {
                                updatePrint();
                            }
                        }
                        break;

                    /**
                     * Flèche de gauche ou Q: déplacement à gauche
                     */
                    case KeyEvent.VK_Q:
                    case KeyEvent.VK_LEFT:
                        if (!isPause()) {
                            currentPiece.moveLeft();
                            if (board.verifCollision(currentPiece)) {
                                currentPiece.moveRight();
                            } else {
                                updatePrint();
                            }
                        }
                        break;

                    /**
                     * Flèche de droite ou D: déplacement à droite
                     */
                    case KeyEvent.VK_D:
                    case KeyEvent.VK_RIGHT:
                        if (!isPause()) {
                            currentPiece.moveRight();
                            if (board.verifCollision(currentPiece)) {
                                currentPiece.moveLeft();
                            } else {
                                updatePrint();
                            }
                        }
                        break;

                    case KeyEvent.VK_S:
                    case KeyEvent.VK_DOWN:
                        run();
                        break;

                    case KeyEvent.VK_ENTER:
                        if (isGameOver()) {
                            initGame();
                        }
                        break;

                    case KeyEvent.VK_P:
                        setPause(!isPause());
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

        this.initGame();
        this.loop();
    }

    /**
     * Lancer le jeu
     */
    private void run() {
        if (!isPause()) {
            this.currentPiece.moveDown();

            if (this.board.verifCollision(this.currentPiece)) {
                this.currentPiece.cancelMoveDown();
                this.changePiece();
            }

        }

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
        if (isGameOver() || isPause()) {
            this.board.printPause(isGameOver());
        } else {
            this.board.print(this.currentPiece);
        }
        this.board.repaint();
        this.sideBar.repaint();
    }

    /**
     * La boucle du jeu
     */
    private void loop() {

        while (true) {
            run();
            if (!isPause()) {
                this.speed--;
            }
            try {
                Thread.sleep(this.speed);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    /**
     * Initialisation de la partie
     */
    private void initGame() {
        this.board.reset();
        this.speed = 800;
        this.currentPiece = randomPiece();
        this.nextPiece = randomPiece();
        this.setGameOver(false);
        this.updatePrint();
        this.score = 0;
    }

    /**
     * Change la pièce avec la suivant
     */
    private void changePiece() {
        this.board.addPiece(this.currentPiece);
        switch (this.board.fullLines()) {
            case 1:
                this.score += 50;
                break;
            case 2:
                this.score += 100;
                break;
            case 3:
                this.score += 200;
                break;
            case 4:
                this.score += 400;
                break;
        }
        this.currentPiece = this.nextPiece;
        if (this.board.verifCollision(this.currentPiece)) {
            setGameOver(true);
        } else {
            this.nextPiece = this.randomPiece();
        }
    }

    /**
     * Indique si la partie est finie
     *
     * @return Vrai si la partie est finie, Faux sinon
     */
    public boolean isGameOver() {
        return gameOver;
    }

    /**
     * Définir la fin de la partie
     *
     * @param gameOver Vrai si la partie est finie, Faux sinon
     */
    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    /**
     * Indique si la partie est en pause
     *
     * @return Vrai si la partie est en pause, Faux sinon
     */
    public boolean isPause() {
        return pause;
    }

    /**
     * Définir si la partie est en pause
     *
     * @param pause Vrai si la partie est en pause, Faux sinon
     */
    public void setPause(boolean pause) {
        this.pause = pause;
    }

    /**
     * Donne le score actuel
     *
     * @return Le score
     */
    public int getScore() {
        return score;
    }

    /**
     * Donne la pièce suivante
     *
     * @return La pièce suivante
     */
    public Piece getNextPiece() {
        return nextPiece;
    }
}
