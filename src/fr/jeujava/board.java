package fr.jeujava;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author gen
 */
public class board extends JPanel {
    
    public static int[][] wallArray = new int[800][600];

    public static int x = 0;
    int y = 0;
    public void moveBall() {
        x = x + 1;
        y = y + 1;
    }
    
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval(x, y, 30, 30);
        
        /*
        for (int i = 0; i<wallArray.length; i++) {
            for (int j = 0; j<wallArray[0].length; j++){
                //do something for every field in the array
                //setColor(Color.getColor(wallArray[i][j], 50, 50)); 
                g.drawLine(i,j,i,j);
            }
        }*/
    }
    
    
    public void drawBoard() {
        
    }
}
