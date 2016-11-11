
import java.awt.BorderLayout;
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

import java.awt.*;
import javax.swing.*;

public class pauls_firstPanel extends javax.swing.JPanel

{
   
    public pauls_firstPanel ()
{
    
 
super ();    
BorderLayout border = new BorderLayout();
setLayout(border);
//GridLayout grid = new GridLayout(1,3,4,1);
//setLayout(grid);


  
setBackground(Color.pink);
JButton jb1 = new JButton("PBW5003 Assignment 4");
jb1.setBackground(Color.WHITE);
JButton jb2 = new JButton("Assignment Footer");
jb2.setBackground(Color.gray);
JButton jb3 = new JButton("I am on the South)");
jb3.setBackground(Color.CYAN);

JButton jb4 = new JButton( );
jb4.setBackground(Color.green);


 
 
add(jb1,"North");
add(jb2,"South");







}
    

}