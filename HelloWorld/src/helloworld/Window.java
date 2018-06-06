
package helloworld;

import javax.swing.JFrame;//C# = using System.Windows.Forms

public class Window  extends JFrame // heritage de classe JFrame
{
    public Window(String _title, int _width,int _height)
    {
        this.setTitle(_title);
        
        this.setSize(_width, _height);
        
        this.setLocationRelativeTo(null);
        //centre la fenetre par rappor à l'ecran
        
        this.setVisible(true);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //quand la fenetre se ferme,ferme l appli
    }
}
