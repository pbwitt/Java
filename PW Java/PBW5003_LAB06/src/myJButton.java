

import java.awt.Color;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pbw5003
 */
public class myJButton extends JButton

{
    public myJButton(String text)
    {
        super(text); 
        setBackground(Color.red); 
        setOpaque(true); 
    }
}