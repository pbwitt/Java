import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
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
public class ControlPanel extends JPanel

{
  //IntroJPanel p1;
  //DesignerJPanel dp1;
  


   
    public ControlPanel()
    {
        super ();
        setBackground(Color.gray);
        

        setLayout(new GridLayout(0,1));
        IntroJPanel p1 = new IntroJPanel();
        add(p1);
        //p1.setVisible(true);
        
        DesignerJPanel dp1 = new DesignerJPanel();
        //add (dp1);
        //dp1.setVisible(true);
        
           

                
                    

   }
    
}

    
