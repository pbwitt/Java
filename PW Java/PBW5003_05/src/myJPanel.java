/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
/**
 *
 * @author pbw5003
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class myJPanel extends JPanel
{ 
     
	public myJPanel()
	{
		super();
       {
		
        //------------------------------------------------------
        // Create components: Jpanel, JLabel and JTextField

                myJPanel1 p1 = new myJPanel1();

// Sharing info through constructor.
        //------------------------------------------------------
        // Choose a Layout for JFrame and 
        // add Jpanel to JFrame according to layout    	
	   setLayout(new BorderLayout());
	      add(p1, "Center");

	}
     }
//-------------------------------------------------------------------
}


//
//import java.awt.*;
//import javax.swing.*;
//
//public class myJPanel extends JPanel
//{
//	public myJPanel()
//	{
//		super();
//		setBackground(Color.gray);
//		
//		setLayout(new BorderLayout());
//		
//		myJPanel1 p1 = new myJPanel1();
//		add(p1,"North");
//		myJPanel2 p2 = new myJPanel2();
//		add(p2,"Center");
//		
//			
//		
//	}
//}