
import java.awt.Color;
import static java.awt.Color.BLUE;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class IntroJPanel extends JPanel
{
    
    
    IntroJPanel ()
    {
        
       super();
       setBackground(new Color(224, 224, 224));
       setLayout(null);
       
       
       Border thickBorder = new LineBorder(Color.BLACK, 3);
        
       JButton j12 = new JButton(); 
       j12.setText("Welcome to PSU BattleShip!!");
       add(j12);
       j12.setBorder(thickBorder);
       j12.setBounds(0,0,640,30);
       //j12.setVisible(true);
       j12.setFont(new Font("Arial", Font.PLAIN, 20));
   
       j12.setBackground(Color.BLUE); 
       j12.setForeground(Color.white);
       j12.setOpaque(true);
       
       ImageIcon imageLion = new ImageIcon("images/Nittany_Lion.gif");
       Image img = imageLion.getImage();
       Image newimg = img.getScaledInstance(320, 455,  java.awt.Image.SCALE_SMOOTH);
       imageLion = new ImageIcon(newimg);
            
            
       ImageIcon imageBattleship = new ImageIcon("images/battleship.jpg");
       Image img1 = imageBattleship.getImage();
       Image newimg1 = img1.getScaledInstance(320, 455,  java.awt.Image.SCALE_SMOOTH);
       imageBattleship = new ImageIcon(newimg1);
               
             
       JButton jb1 = new JButton(); 
       add(jb1);
       jb1.setBounds(0,20,320,455);
       jb1.setIcon(imageLion);
       jb1.setBorderPainted(true);
       
                
       JButton jb2 = new JButton();
       add(jb2);
       jb2.setBounds(320,20,320,455);
       jb2.setIcon(imageBattleship);
       jb2.setBorderPainted(true);
       
       
    }
       
}
