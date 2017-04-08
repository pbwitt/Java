import java.awt.*;
import javax.swing.*;
public class myJPanelstd extends JPanel 
{
	JTextField message;

	public myJPanelstd()
	{
		setLayout(new GridLayout(1,1));
		setBackground(Color.pink);
                message = new JTextField("Messages will appear here",15);		
		add(message);
	}
	public void display(String s)
	{
		message.setText(s);
	}
	
}
