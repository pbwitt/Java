import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class myJFrame3 extends JFrame implements ActionListener
{
	myJPanelstd mjp;
	JMenuBar myMenu;
	JMenu jm1, jm2, jm3, jm4;
	JMenuItem jmi11, jmi12, jmi21, jmi31, jmi4;
	JMenuItem jmi41, jmi42, jmi43, jmi44;
	public myJFrame3 ()
	{
            super ("A Simple Java Frame with a Menu");
            mjp = new myJPanelstd();
            add(mjp);            
//-------------------------------------------------------	    
// create instance of the Menubar, Menus, and MenuItems
//-------------------------------------------------------	    
	    myMenu = new JMenuBar();
	    jm1 = new JMenu("File");
	    jm2 = new JMenu("Edit");
	    jm3 = new JMenu("View");
	    jm4 = new JMenu("Other");
	    jmi11 = new JMenuItem("MenuItem 1.1");
	    jmi12 = new JMenuItem("MenuItem 1.2");
	    jmi21 = new JMenuItem("MenuItem 2.1");
	    jmi31 = new JMenuItem("MenuItem 3.1");
	    jmi4 = new JMenuItem("MenuItem 4");
	    jmi41= new JMenuItem("subsubMenu of 4.1");
	    jmi42 = new JMenuItem("subsubMenu of 4.2");
	    jmi43 = new JMenuItem("subsubMenu of 4.3");
	    jmi44 = new JMenuItem("subsubMenu of 4.4");
//-------------------------------------------------------	    
// add MenuItems to Menus, add Menu to MenuBar		
//-------------------------------------------------------	    
            jm1.add(jmi11);
            jm1.add(jmi12);
            jm2.add(jmi21);
            jm3.add(jmi31);

            jm4.add(jmi41);
            jm4.add(jmi42);
            jm4.add(jmi43);
            jm4.add(jmi44);

            myMenu.add(jm1);
            myMenu.add(jm2);
            myMenu.add(jm3);
            myMenu.add(jm4);
//----------------------------------------------------------------	    
// Tell JFrame that myMenu will be the default Menu for this Frame
//----------------------------------------------------------------	    
		this.setJMenuBar(myMenu);
//----------------------------------------------------------------	    
// add action listeners for each Menu Item
//----------------------------------------------------------------
            jmi11.addActionListener(this); 
            jmi12.addActionListener(this); 
            jmi21.addActionListener(this); 
            jmi31.addActionListener(this); 
            jmi41.addActionListener(this); 
            jmi42.addActionListener(this); 
            jmi43.addActionListener(this); 
            jmi44.addActionListener(this); 
//----------------------------------------------------------------
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize (640, 480);
            setVisible(true);
	}
//-------------------------------------------------------------------
// actionPerformed
    public void actionPerformed(ActionEvent event) 
    {
	Object obj = event.getSource();
       	String choice = event.getActionCommand();
        mjp.display("the choice was "+choice);
    }
}
