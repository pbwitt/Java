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

public class MainJFrame extends JFrame 

{   
 

  
  
public MainJFrame ()
	{
		super ("Team 07");
                
 
                
  	 	ControlPanel mjp = new ControlPanel();
                mjp.setBackground(Color.BLUE);
                getContentPane().add(mjp,"Center");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize (640, 480);
		setVisible(true); 
                
                
                
                
    
    }
    
    
  
                

	
    

    
    
}
