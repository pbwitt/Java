
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
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
public class ControlPanel extends JPanel implements ActionListener


{
  
  JButton jb2; 
  JMenuItem exit, play;
  JMenuItem designers, instructions;
  
   
   ControlPanel(){
       
       JButton j12 = new JButton("Welcome to PSU BattleShip!!"); 
                add(j12, "North");
                j12.setVisible(true);
                j12.setFont(new Font("Arial", Font.PLAIN, 20));
   
                j12.setBackground(Color.BLUE); 
                j12.setForeground(Color.white);
                
                ImageIcon imageLion = new ImageIcon("images/Nittany_Lion.gif");
                Image img = imageLion.getImage();
                Image newimg = img.getScaledInstance(300, 225,  java.awt.Image.SCALE_SMOOTH);
                imageLion = new ImageIcon(newimg);
            
            
                ImageIcon imageBattleship = new ImageIcon("images/battleship.jpg");
                Image img1 = imageBattleship.getImage();
                Image newimg1 = img1.getScaledInstance(350, 225,  java.awt.Image.SCALE_SMOOTH);
                imageBattleship = new ImageIcon(newimg1);
               
             
                JButton jb1 = new JButton(); 
                add(jb1,"West");
                jb1.setIcon(imageLion);
                jb1.setVisible(true);
                
                JButton jb2 = new JButton();
                add(jb2,"East");
                jb2.setIcon(imageBattleship);
                jb2.setVisible(true);
                
                    
                JMenuBar menuBar = new JMenuBar();
                JMenu menu = new JMenu("Menu");
                JMenu credits = new JMenu("Credits");
                menuBar.add(menu);
                menuBar.add(credits);
    
                play = new JMenuItem("Play");
                exit = new JMenuItem("Exit");
    
                play.addActionListener(this);
                exit.addActionListener(this);
    
                menu.add(play);
                menu.add(exit);
    
                exit.setActionCommand("Exit");
                setJMenuBar(menuBar);
                setVisible(true);
                
                designers = new JMenuItem("Designers");
                instructions = new JMenuItem("Instructions");
                
                credits.add(designers);
                credits.add(instructions);

   }
    

     public void actionPerformed (ActionEvent e)
    {
        Object obj = e.getSource();
        
        if(obj == exit)
        {
            System.exit(0);
        }
    
    }
   
   
    
    
    
    
}
