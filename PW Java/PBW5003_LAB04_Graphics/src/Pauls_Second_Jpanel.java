
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

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


public class Pauls_Second_Jpanel extends JPanel

{ 
      public Pauls_Second_Jpanel ()

      {
super ();    
//BorderLayout border = new BorderLayout();
//setLayout(border);
GridLayout grid = new GridLayout(1,3,4,1);
setLayout(grid);
setBackground(Color.pink);
JButton jb1 = new JButton("Paul's ");
jb1.setBackground(Color.WHITE);
JButton jb2 = new JButton("Second");
jb2.setBackground(Color.yellow);
JButton jb3 = new JButton("J Panel");
jb3.setBackground(Color.CYAN);



add(jb1, "North"  );
add(jb2);
add(jb3); 

}
}


