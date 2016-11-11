import java.awt.*;
import javax.swing.*;

public class myJFrame extends JFrame
{
	myJPanelTimer mjp;
	public myJFrame ()
	{
		super ("a Timer example");
//------------------------------------------------------
// Create components
    	mjp = new myJPanelTimer();
//------------------------------------------------------
// Choose a Layout for JFrame and 
// add Jpanel to JFrame according to layout    	
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(mjp,"Center");
//------------------------------------------------------
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize (640, 480);
		setVisible(true);
	}
}
