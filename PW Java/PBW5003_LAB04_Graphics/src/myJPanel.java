/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pbw5003
 */
import java.awt.*;
import javax.swing.*;
public class myJPanel extends JPanel
{
    
    
public myJPanel ()
{

super ();

GridLayout grid = new GridLayout(1,1,3,4);
setLayout(grid);
setBackground(Color.orange);

Pauls_Second_Jpanel left = new Pauls_Second_Jpanel(); 
pauls_firstPanel right = new pauls_firstPanel(); 
add(left); 

add(right); 

}
}