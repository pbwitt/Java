import java.awt.*;
import javax.swing.*;
public class myJFrame extends JFrame
{
	public myJFrame ()

                
	{
            super ("My First Frame");
            ControlJPanel mjp = new ControlJPanel();          
            getContentPane().add(mjp,"Center");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize (400, 800);
            setVisible(true);
       
	}
}
