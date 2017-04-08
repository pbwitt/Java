import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pbw5003
 */

public class MainJFrame extends JFrame implements ActionListener

{   
 
  JButton jb4; 
  JMenuItem exit, play;
  JMenuItem designers, instructions;
  
  
  
public MainJFrame ()
	{
		super ("Team 07");
                
 
                
  	 	ControlPanel mjp = new ControlPanel();
                mjp.setBackground(Color.BLUE);
                getContentPane().add(mjp,"Center");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize (640, 480);
		setVisible(true); 
                
                
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
                
                //JButton jb3 = new JButton();

                
                

                //jb3.setBackground(Color.BLUE);

                
                //jb3.setBackground(Color.BLUE);
         
                //add(jb2,"Center"); 
                //jb2.setBackground(Color.BLUE); 
                
                    
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
