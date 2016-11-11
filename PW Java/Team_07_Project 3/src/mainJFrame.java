//import com.sun.glass.events.KeyEvent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.event.InputEvent.CTRL_DOWN_MASK;
import java.awt.event.KeyEvent;
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
  GamePanel gp1; 
  
public mainJFrame ()
    {
		super ("Team 07");
                           
                cardLayout = new CardLayout();

                cardJPanel = new JPanel(cardLayout);
                cardJPanel.setBackground(Color.cyan);
                cardJPanel.setSize(1024,805);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true); 
                
                cardJPanel.setLayout(cardLayout);
                
                intro = new IntroJPanel();
                dp1 = new DesignerJPanel();
                instructionp = new InstructionJPanel();
                //gp1 = new GamePanel(); 
                
                cardJPanel.add("Intro", intro);
                
                
                gp1 = new GamePanel(intro); 
                
                cardJPanel.add("Designers", dp1);
                cardJPanel.add("Instructions", instructionp);
                cardJPanel.add("Play", gp1); 
                
                
                
                
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
                play.addActionListener(this);
                
                
                KeyStroke p = KeyStroke.getKeyStroke(KeyEvent.VK_P, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask());
                KeyStroke e = KeyStroke.getKeyStroke(KeyEvent.VK_E, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask());
                KeyStroke h = KeyStroke.getKeyStroke(KeyEvent.VK_H, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask());
                KeyStroke d = KeyStroke.getKeyStroke(KeyEvent.VK_D, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask());
                KeyStroke i = KeyStroke.getKeyStroke(KeyEvent.VK_I, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask());
                
                
                play.setAccelerator(p);
                exit.setAccelerator(e);
                home.setAccelerator(h);
                designers.setAccelerator(d);
                instructions.setAccelerator(i);

                this.getContentPane().add(cardJPanel, BorderLayout.CENTER);
                this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize (1024, 805);
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
        
        if (obj == play)
        {    
            cardLayout.show(cardJPanel,"Play"); 
            intro.imageTimer.stop();
            System.out.println("Play Works");
            
            
        }
    }
     
}