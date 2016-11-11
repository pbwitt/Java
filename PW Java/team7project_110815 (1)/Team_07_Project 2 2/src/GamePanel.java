
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pbw5003
 */
//public class GamePanel extends JPanel implements  ActionListener
public class GamePanel extends JPanel implements ActionListener
{
        IntroJPanel inp;
        String a, b, c;
        GamePanelBoard gpb1;
        GamePanelBoard2 gpb2;
        GamePanelSettings gps1;
        Boolean switchPanel = false;
        
        public GamePanel (IntroJPanel n)
        {
        super ();
        setBackground(Color.gray);        
        setLayout(null);
        
        inp = n;
        
        a = inp.shipsNumber1;
        b = inp.difficultyLevel;
        c = inp.compIntelType;
        
        
        System.out.println(inp.shipsNumber1 + " " + b + " " + c);
        
        gps1 = new GamePanelSettings(inp);
        gps1.setBounds(0, 0, 280, 768);
        gpb1 = new GamePanelBoard();
        gpb1.setBounds(280, 0, 744, 768);
        gpb2 = new GamePanelBoard2();
        gpb2.setBounds(280, 0, 744, 768);
        
        add(gpb1);
        add(gpb2);
        add(gps1);
        
        gpb1.setVisible(true);
        gpb2.setVisible(false);
        
        gps1.switchTurn.addActionListener(this);


        }
        
        public void actionPerformed(ActionEvent e) 
        {
            
        Object obj = e.getSource();
        
        if (obj == gps1.switchTurn)
        {
            if (switchPanel == false)
            {
            System.out.println("it works");
            gpb1.setVisible(false);
            gpb2.setVisible(true);
            switchPanel = true;
            }
            else
            {
            gpb1.setVisible(true);
            gpb2.setVisible(false);  
            switchPanel = false;
            }
            
        }
        
        }
}
        
   
 
        
