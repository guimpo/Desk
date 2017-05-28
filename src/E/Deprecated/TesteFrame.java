/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E.Deprecated;

import java.util.List;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author paulo
 */
public class TesteFrame extends JFrame
{
    private JTextField[] notas;
        
    public TesteFrame()
    {
        this.notas = new JTextField[5];
        this.setVisible(true);
    }  

    @Override
    public void setVisible(boolean b)
    {
        super.setVisible(b); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setNotasPrimeiroTrimestre(long... notasPrimeiroTrimestre)
    {
        for(long nota : notasPrimeiroTrimestre)
        {
            
        }
    }

    
}
