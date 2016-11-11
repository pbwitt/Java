
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
public class GamePanel extends JPanel 
{
        IntroJPanel inp;
        String a, b, c;
    
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
        
        GamePanelSettings gps1 = new GamePanelSettings(inp);
        gps1.setBounds(0, 0, 140, 480);
        GamePanelBoard gpb1 = new GamePanelBoard();
        gpb1.setBounds(140, 0, 500, 480);
        

        add(gps1);
        add(gpb1);
        

        }

}
        
   
 
        
