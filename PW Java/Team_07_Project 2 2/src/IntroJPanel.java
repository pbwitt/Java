
import java.awt.Color;
import static java.awt.Color.BLUE;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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


public class IntroJPanel extends JPanel implements ActionListener
{
    
    JComboBox ships, compIntel, difficulty;
    String shipsNumber,compIntelType, difficultyLevel, shipsNumber1;
    //IntroJPanel intro;
    Timer imageTimer;
    JLabel backgroundpsu, backgroundship;
    ImageIcon imageLion, imageBattleship;
    Integer n=0;
    
    public IntroJPanel ()
    
            
        
       {
        
       super();
       //setBackground(new Color(224, 224, 224));
       setLayout(null);
       
       
       Border thickBorder = new LineBorder(Color.BLACK, 3);
        
       JButton j12 = new JButton(); 
       j12.setText("Welcome to PSU BattleShip!!");
       add(j12);
       j12.setBorder(thickBorder);
       j12.setBounds(0,0,1024,30);
       //j12.setVisible(true);
       j12.setFont(new Font("Arial", Font.PLAIN, 20));
   
       j12.setBackground(Color.BLUE); 
       j12.setForeground(Color.white);
       j12.setOpaque(true);
       
       imageLion = new ImageIcon("images/Nittany_Lion.gif");
       Image img = imageLion.getImage();
       Image newimg = img.getScaledInstance(400, 325,  java.awt.Image.SCALE_SMOOTH);
       imageLion = new ImageIcon(newimg);
                 
       imageBattleship = new ImageIcon("images/battleship.jpg");
       Image img1 = imageBattleship.getImage();
       Image newimg1 = img1.getScaledInstance(400, 325,  java.awt.Image.SCALE_SMOOTH);
       imageBattleship = new ImageIcon(newimg1);
              
       String shipsList[] = {"# of Ships", "2", "3", "4", "5"};
       String compIntelList[] = {"Computer Inteliligence", "Easy", "Normal"};
       String difficultyList [] = {"Difficulty", "Easy", "Medium", "Hard"};
       
       ships = new JComboBox(shipsList);
       ships.setBounds(633, 40, 125, 25);  
       ships.setOpaque(true);
       ships.addActionListener(this);
       
       compIntel = new JComboBox(compIntelList);
       compIntel.setBounds(643, 100, 250, 25);
       compIntel.setOpaque(true);
       compIntel.addActionListener(this);
       
       difficulty = new JComboBox(difficultyList);
       difficulty.setBounds(778, 40, 125, 25);
       difficulty.setOpaque(true);
       difficulty.addActionListener(this);

       add(ships);
       add(compIntel);
       add(difficulty);
       
       backgroundship = new JLabel (imageBattleship);
       backgroundship.setBounds(512,20, 512, 738);
       add(backgroundship);
       
       backgroundpsu = new JLabel (imageLion);
       backgroundpsu.setBounds(0,20, 512, 738);
       add(backgroundpsu);
       
       imageTimer = new Timer(1500,this);
       imageTimer.start();
      
    }    
    
         public void actionPerformed (ActionEvent e)
    {
        Object obj = e.getSource();
        
        if (obj == imageTimer)
        {
            
            System.out.println("timer started");
            
            if ( n %2 == 0)
            {
              backgroundpsu.setIcon(imageLion);
              backgroundship.setIcon(imageBattleship);
              repaint();
              n = n+1;
              System.out.println("timer n=0 " + n);
            }
            else
            {
             backgroundpsu.setIcon(imageBattleship);
             backgroundship.setIcon(imageLion);
             repaint();
             n = n+1;
             System.out.println("timer n=1 " + n);
            }
            
     
            
        }
        
         
        
        if(obj == ships)
        {
            
            shipsNumber = ships.getSelectedItem().toString();
            System.out.println(ships.getSelectedItem());
            System.out.println(shipsNumber);
           
           
        }
        
        if(obj == compIntel)
        {
            
            compIntelType = (String)compIntel.getSelectedItem();
        }
                
        if(obj == difficulty)
        {
            
            difficultyLevel = (String) difficulty.getSelectedItem();
        }        
    }
       
}
