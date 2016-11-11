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
student st1 = new student("Zack","Mills", 22);
JLabel jbl = new JLabel(st1.getInfo() + " 1.  " + st1.whatsUp() + " 2.  " + st1.whatsUp() + " 3.  " + st1.whatsUp()
        + " 4.  " +st1.whatsUp() + "\n 5.  " + st1.whatsUp() + " 6.  " + st1.whatsUp() + " 7.  " + st1.whatsUp() + " 8.  " +st1.whatsUp() + " 9.  " + st1.whatsUp() + " 10.  " +st1.whatsUp());
GridLayout grid = new GridLayout(1,1,3,4);
setLayout(grid);
setBackground(Color.orange);

pauls_firstPanel right = new pauls_firstPanel(); 

//add(right); 
add(jbl); 
}
}