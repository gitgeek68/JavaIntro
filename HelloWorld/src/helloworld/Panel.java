package helloworld;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Panel extends JPanel 
{
    private int posX = 10;
    private int posY = 160;
    
     /**
     * @return the posX
     */
    public int getPosX() {
        return posX;
    }

    /**
     * @param posX the posX to set
     */
    public void setPosX(int posX) //accesseur ou mutateur 'termes'
    {
        this.posX = posX;
    }

    /**
     * @return the posY
     */
    public int getPosY() {
        return posY;
    }

    /**
     * @param posY the posY to set
     */
    public void setPosY(int posY) {
        this.posY = posY;
    }
    
    
    
    
    
    public Panel() 
    {
        super();
    }

    @Override
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        
        Font font = new Font("Arial",Font.BOLD,24);
        //crée une police
        
        g.setFont(font);
        
        g.setColor(Color.YELLOW);
        
        g.drawString("je demarre Java", 5, 25);
        
        g.drawRect(10, 50, 200, 100);
        
        g.fillRect(this.getPosX(), this.getPosY(), 200, 100);
    }

   
    
   
}
