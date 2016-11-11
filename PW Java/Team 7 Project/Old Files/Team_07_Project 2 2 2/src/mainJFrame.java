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
 * @author pbw5003mn 
 */

public class mainJFrame extends JFrame implements ActionListener

{   
 

  JMenuItem exit, play, home;
  JMenuItem designers, instructions;
  JPanel DesignerJPanel, IntroJPanel, cardJPanel;
  ControlPanel mjp;
  mainJFrame mjf;
  IntroJPanel intro;
  DesignerJPanel dp1;
  InstructionJPanel instructionp;
  CardLayout cardLayout;
  
public mainJFrame ()
    {
		super ("Team 07");
                           
                cardLayout = new CardLayout();

                cardJPanel = new JPanel(cardLayout);
                cardJPanel.setBackground(Color.cyan);
                cardJPanel.setSize(640,480);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true); 
                
                cardJPanel.setLayout(cardLayout);
                
                intro = new IntroJPanel();
                dp1 = new DesignerJPanel();
                instructionp = new InstructionJPanel();
                
                cardJPanel.add("Intro", intro);
                cardJPanel.add("Designers", dp1);
                cardJPanel.add("Instructions", instructionp);
                 
                
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

                
                this.getContentPane().add(cardJPanel, BorderLayout.CENTER);
                this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize (640, 480);
		this.setVisible(true); 
    
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

         cardLayout.show(cardJPanel, "Designers");
         System.out.println("works");
        } 
        
        if(obj == home)
        {

        cardLayout.show(cardJPanel, "Intro");
        System.out.println("home works");
        
        } 
        
        if(obj == instructions)
        {
      
         cardLayout.show(cardJPanel, "Instructions");
         System.out.println("instr. works");
        }
        
    }
     
}