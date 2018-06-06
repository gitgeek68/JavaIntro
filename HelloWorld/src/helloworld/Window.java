
package helloworld;

import java.awt.Color; // import les colors
import java.util.HashSet;
import java.util.Set;

import javax.swing.JFrame;//C# = using System.Windows.Forms

import javax.swing.JPanel;//panneau java

public class Window  extends JFrame // heritage de classe JFrame
{
    
    Panel panel; 
    
    public Window(String _title, int _width,int _height)
    {
        this.setTitle(_title);
        
        this.setSize(_width, _height);
        
        this.setLocationRelativeTo(null);
        //centre la fenetre par rappor à l'ecran
        
        this.setVisible(true);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //quand la fenetre se ferme,ferme l appli
        
        
        panel = new Panel();//crée un nouveau panneau
        this.setContentPane(panel);
        
        go();
    }
    
    public void setBackgroundColor(Color _color)
    {
        this.getContentPane().setBackground(_color);
                
        
    }
    
     public void  go()
     {
         
       int posMax=(this.getWidth()-10-200);
         
       for(int i = panel.getPosX();i<posMax; i++)  
       {
           panel.setPosX(panel.getPosX()+5);
           panel.repaint();
           
             try 
             {
                 Thread.sleep(200);
             } 
             catch (InterruptedException ex) 
             {
                 ex.printStackTrace();
             }

         }
     }

}
