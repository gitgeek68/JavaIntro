/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javax.swing.JFrame;//C# = using System.Windows.Forms

public class HelloWorld 
{
//static JFrame window;//declaration encadrement window

static Window fenetre;//declaration de la viariable

    public static void main(String[] args) //fenetre
    {
        
        fenetre = new Window("Je suis une fougère!",400,300);
//        window =new JFrame(); //window = nouveau cadre
//        
//        window.setSize(400, 300);//dimensionne la fenetre
//        
//        window.setVisible(true);//rend visible la fenetre
//        
//        window.setLocationRelativeTo(null);
//        //centre la fenetre par rappor à l'ecran
//        
//        window.setTitle("Je suis une fougère");
        
        
    }
    
}
