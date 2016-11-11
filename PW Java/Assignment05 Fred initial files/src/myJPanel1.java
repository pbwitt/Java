import java.awt.*;
import javax.swing.*;

public class myJPanel1 extends JPanel
{
	
	
	
	
	
	
	public myJPanel1()
	{
		super();
		setBackground(Color.yellow);
		
		student st1 = new student("Fred","Fonseca",44);
		// the whatsUp of this student has to shown in the other panel
		
		JButton jl1 = new JButton(st1.getInfo());
		add(jl1);
	}
	
	
	
	
	
	
}