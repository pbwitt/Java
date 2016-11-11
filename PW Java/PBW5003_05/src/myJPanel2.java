
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pbw5003
 */
public class myJPanel2 extends JPanel
{
    
    
    	//==================================================
	//no changes allowed in myJPanel2 for assignment 05
	//==================================================
	JButton b1,b2,b3,b4;
	
	public myJPanel2()
	{
		super();
		setBackground(Color.pink);
		//setLayout(new GridLayout(3,1));
		b1 = new JButton("When the user clicks on the button in the UPPER panel" );
		add(b1);
		
		b2 = new JButton("Display here whatsUp from the student in UPPER Panel" );
		add(b2);
			
		b3 = new JButton("===>>>>You CANNOT create a student here <======" );
		add(b3);
		
		b4 = new JButton("It has to be the student from the UPPER Panel" );
		add(b4);
	}
    
    
}
