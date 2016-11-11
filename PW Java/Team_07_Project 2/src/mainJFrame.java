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

public class mainJFrame extends JFrame implements ActionListener

{   
 

  JMenuItem exit, play, home;
  JMenuItem designers, instructions;
  JPanel DesignerJPanel, IntroJPanel;
  ControlPanel mjp;
  mainJFrame mjf;
  IntroJPanel intro;
  DesignerJPanel dp1;
  InstructionJPanel instructionp;
  
public mainJFrame ()
    {
		super ("Team 07");
                
 
                
  	 	//ControlPanel mjp = new ControlPanel();
                //mjp.setBackground(Color.BLUE);
                //getContentPane().add(mjp,"Center");
                
                intro = new IntroJPanel();
                intro.setBackground(Color.BLUE);
                getContentPane().add(intro,"Center");
                
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize (640, 480);
		setVisible(true); 
                
                JMenuBar menuBar = new JMenuBar();
                JMenu menu = new JMenu("Menu");
                JMenu credits = new JMenu("Credits");
                menuBar.add(menu);
                menuBar.add(credits);
    
                play = new JMenuItem("Play");
                exit = new JMenuItem("Exit");
                home = new JMenuItem("Home");
    
                play.addActionListener(this);
                exit.addActionListener(this);
                home.addActionListener(this);
                
                menu.add(home);
                menu.add(play);
                menu.add(exit);
    
                exit.setActionCommand("Exit");
                setJMenuBar(menuBar);
                setVisible(true);
                
                designers = new JMenuItem("Designers");
                instructions = new JMenuItem("Instructions");
                
                credits.add(designers);
                credits.add(instructions);
                
                designers.addActionListener(this);
                instructions.addActionListener(this);

                
                
                
    
    }
        
     public void actionPerformed (ActionEvent e)
    {
        Object obj = e.getSource();
        
        if(obj == exit)
        {
            System.exit(0);
        }
        
        if(obj == designers)
        {
         dp1 = new DesignerJPanel(); 
         add(dp1);
         //getContentPane().add(dp1,"Center");
         //remove(intro);
         //remove(instructionp);
         //remove(home);
         add(dp1);
         validate();
         setVisible(true);
         System.out.println("works");
        } 
        
        if(obj == home)
        {

         intro = new IntroJPanel();
         //remove(dp1);
         //remove(instructionp);
         add(intro);
         validate();
         setVisible(true);
         System.out.println("works");
        } 
        
        if(obj == instructions)
        {

         instructionp = new InstructionJPanel();
         //remove(dp1);
         //remove(intro);
         add(instructionp);
         validate();
         setVisible(true);
         System.out.println("works");
        }
        
    }
     
}