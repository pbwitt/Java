import java.awt.*;
import javax.swing.*;

public class myJPanel extends JPanel
{
	JButton b1; 
      
    
    public myJPanel()
	{
           
            
		super();
		setBackground(Color.gray);
                     
		
		setLayout(new GridLayout(1, 10));
                
                myJPanel2 p2 = new myJPanel2();

		myJPanel1 p1 = new myJPanel1(p2);

		add(p1,"Left");
		add(p2,"Right");
		
			
		
	}
}