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
import java.awt.event.*;

public class myJPanel1 extends JPanel implements ActionListener
{
	myJButton jl1;
        student st1;
        JButton jb2; 
        myJPanel2 mjp2;
        
    
	public myJPanel1()
	{
            // Handle input parameter
         
           
		setLayout(new GridLayout(3,2));

                st1 = new student("Fred","Fonseca",44);
		// the whatsUp of this student has to shown in the other panel		
		jl1 = new myJButton(st1.getInfo());
                jl1.addActionListener(this);
		add(jl1);  
                
                mjp2 = new myJPanel2(); 
                add(mjp2); 
                jb2 = mjp2.b2; 

      
	}
//=====================================
    public void actionPerformed(ActionEvent event) 
    {
       	 Object obj = event.getSource();
        
//=====================================
     	 if (obj == jl1){
             jb2.setText(st1.firstName + " is " + st1.whatsUp());
        
         }

    }
 
}


